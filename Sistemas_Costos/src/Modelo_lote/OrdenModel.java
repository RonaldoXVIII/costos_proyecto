
package Modelo_lote;

import Vista_Lote.FrmPrincipal;
import Modelo_lote.Base;
import Modelo_lote.Departamento;
import Modelo_lote.Empresa;
import Modelo_lote.Orden;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrdenModel 
{
    private Orden orden;
    private Empresa objEmpresa;
    int cantidadDep, DepsBasesLlenadas = 0;
    
    FrmPrincipal objFrmPrincipal;

    public OrdenModel(FrmPrincipal objFrmPrincipal) 
    {
        this.objFrmPrincipal = objFrmPrincipal;    
    }
    
    public void CrearOrden() throws CloneNotSupportedException
    {
        int numero = Integer.parseInt(objFrmPrincipal.txtNumeroOrden.getText()) ,
              unidades = Integer.parseInt(objFrmPrincipal.txtUnidades.getText());
        double importeMaterialDirecto = Double.parseDouble(objFrmPrincipal.txtImporteMaterialDirecto.getText());
   
        orden = new Orden(numero, unidades, importeMaterialDirecto);
        
        objEmpresa = objFrmPrincipal.objEmpresaController.getEmpresaController();
        cantidadDep = objEmpresa.getListaDepartamentos().size();
        
        objFrmPrincipal.btnLlenarBasesDepartamentos.setEnabled(true);
        
        
        JOptionPane.showMessageDialog(null,"Orden Creada, Empiece llenando el Departamento " +objEmpresa .getListaDepartamentos().get(0).getNombre() );
    }
    
    public void LlenarBaseDepartamento() throws CloneNotSupportedException
    {
        if(DepsBasesLlenadas < cantidadDep)
        {
            String nombreBaseAsignacionCosto = objEmpresa.getBaseAsignacionDeCosto().getNombre();                            
            Base baseEmpresa;
            
            System.out.println("EL NOMBRE DE BASE DE ASIG ES: " + nombreBaseAsignacionCosto);
            
            ArrayList<Base> listaBases = new ArrayList<Base>();
            listaBases.addAll(objEmpresa.getListaBases());
            
            ArrayList<Base> listaBasesParaOrden = new ArrayList<Base>(); 
            
            for(Base base: listaBases)           
                listaBasesParaOrden.add((Base)base.clone());             
            
            for(int i=0; i<objEmpresa.getListaBases().size(); i++)
            {
                baseEmpresa = (Base)objEmpresa.getListaBases().get(i).clone();
                
                System.out.println("ENTRÓ AL FOR");
                
                if(baseEmpresa.getNombre().equals("Mano de Obra"))
                {
                    System.out.println("LA BASE ACTUAL ES DE MANO DE OBRA !!");
                    
                    int horasMO = Integer.parseInt(objFrmPrincipal.txtHMO.getText());
                    listaBasesParaOrden.get(i).setHoras(horasMO);
                    
                    if(nombreBaseAsignacionCosto.equals("Mano de Obra"))
                    {                
                        double costoPorHoraMO = Double.parseDouble(objFrmPrincipal.txtCostoPorHMO.getText());   
                        orden.EstablecerImporteBaseAsignadoCostos(horasMO, costoPorHoraMO);
                        
                        System.out.println("EL IMPORTE  DE BASE ASIGNADO PARA COSTOS ES: " + orden.getImporteBaseAsignadaCostos());
                        
                        listaBasesParaOrden.get(i).setCostoPorHora(costoPorHoraMO);            
                    }       
                }
                else if(baseEmpresa.getNombre().equals("Maquinaria"))
                {
                    int horasMA = Integer.parseInt(objFrmPrincipal.txtHMaquina.getText()); 
                    listaBasesParaOrden.get(i).setHoras(horasMA);
                    
                    if(nombreBaseAsignacionCosto.equals("Maquinaria"))
                    {                 
                        double costoPorHoraMA = Double.parseDouble(objFrmPrincipal.txtCostoPorHMaquina.getText());
                        orden.EstablecerImporteBaseAsignadoCostos(horasMA, costoPorHoraMA);
                        
                         System.out.println("EL IMPORTE  DE BASE ASIGNADO PARA COSTOS ES: " + orden.getImporteBaseAsignadaCostos());
                        
                        listaBasesParaOrden.get(i).setCostoPorHora(costoPorHoraMA);
                    }     
                }              
            }          
            
            JOptionPane.showMessageDialog(null,"DEPARTAMENTO " + objEmpresa.getListaDepartamentos().get(DepsBasesLlenadas).getNombre()+" LISTO!!!");
           
            objEmpresa.getListaDepartamentos().get(DepsBasesLlenadas).setListaBasesParaOrden(listaBasesParaOrden);
            
            DepsBasesLlenadas++;
            
            if(DepsBasesLlenadas == cantidadDep)
            {               
                JOptionPane.showMessageDialog(null,"SE LLENARON LAS BASES DE TODOS LOS DEPARTAMENTOS!");
                objFrmPrincipal.btnLlenarBasesDepartamentos.setEnabled(false);
                objFrmPrincipal.btnGenerarOrden.setEnabled(true);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"YA ESTÁN LLENAS LAS BASES DE TODOS LOS DEPARTAMENTOS!");
        }
    }
    
    public void GenerarOrden() throws CloneNotSupportedException
    {
        calcularCifa();
        
        double importeMD = orden.getImporteMaterialDirecto(),
                     importeMDUnidad = orden.getImporteMaterialDirectoUnidad(),
                     importeBaseAsignada = orden.getImporteBaseAsignadaCostos(),
                     importeBaseAsignadaUnidad = orden.getImporteBaseAsignadaCostosUnidad(),
                     importeCIFA = orden.getImporteCifa(),
                     importeCIFAUnidad = orden.getImporteCifaUnidad(),
                     total = orden.getTotal(),
                     totalUnidad = orden.getTotalUnidad();
        String nombreBaseAsignada = objEmpresa.getBaseAsignacionDeCosto().getNombre();

        objFrmPrincipal.atHojaCostos.setText("\t\tResumen de Costo\n" 
                                                                          + "Concepto\t\tImporte\tPor Unidad\n\n"
                                                                          + "Material----------\t\tS/." + importeMD + "\tS/." + importeMDUnidad + "\n"
                                                                          + nombreBaseAsignada + "-------\tS/." + importeBaseAsignada + "\tS/." + importeBaseAsignadaUnidad + "\n"
                                                                          + "CIFA----------------\tS/." + importeCIFA + "\tS/." + importeCIFAUnidad + "\n"
                                                                          + "-------------------------------------------------------------------------------------------------------------------------\n"
                                                                          + "TOTAL-------------\t" + total + "\tS/." + totalUnidad);
    }
    
    public void calcularCifa() throws CloneNotSupportedException
    {
        double CIFA = 0;
        
      //  Empresa objEmpresa = objFrmPrincipal.objEmpresaController.ObtenerEmpresaController();
        
        if(objEmpresa.getTipoCifa().equals("Predeterminado"))
        {
            double totalCIFP = 0, totalBasePresupuestada = 0, totalBaseReal = 0, tasa;
      //      Departamento objDepPrincipal, objDepOrden;
            
            Departamento dep;
            
            for(int i=0; i<objEmpresa.getListaDepartamentos().size(); i++)
            {
                dep = objEmpresa.getListaDepartamentos().get(i);
                
                totalCIFP += dep.getCIPresupuestado();
                
                if(objEmpresa.getBaseAsignacionDeCosto().getNombre().equals("Mano de Obra"))
                {
                    int indiceBaseMO = dep.ObtenerIndiceDeBase("Mano de Obra", dep.getListaBasesParaOrden());
                    
                    totalBasePresupuestada += dep.getListaBasesPresupuestadas().get(indiceBaseMO).getHoras();
                    totalBaseReal += dep.getListaBasesParaOrden().get(indiceBaseMO).getHoras();
                    
                    System.out.println("DEP " + dep.getNombre() + ":\n   -> BASE HMO PRESUPUESTADA: " + dep.getListaBasesPresupuestadas().get(indiceBaseMO).getHoras()
                                                                                                      +      "   -> BASE HMO REAL PARA ORDEN: " + dep.getListaBasesParaOrden().get(indiceBaseMO).getHoras());
                }
                else if(objEmpresa.getBaseAsignacionDeCosto().getNombre().equals("Maquinaria"))
                {
                    int indiceBaseMA = dep.ObtenerIndiceDeBase("Maquinaria", dep.getListaBasesParaOrden());
                    
                    totalBasePresupuestada += dep.getListaBasesPresupuestadas().get(indiceBaseMA).getHoras();
                    totalBaseReal += dep.getListaBasesParaOrden().get(indiceBaseMA).getHoras();
                    
                    System.out.println("DEP " + dep.getNombre() + ":\n   -> BASE HMA PRESUPUESTADA: " + dep.getListaBasesPresupuestadas().get(indiceBaseMA).getHoras()
                                                                                                      +      "   -> BASE HMA REAL PARA ORDEN: " + dep.getListaBasesParaOrden().get(indiceBaseMA).getHoras());
                }
                
               /* objDepPrincipal = objEmpresa.getListaDepartamentos().get(i);
                objDepOrden = objEmpresa.getListaDepartamentos().get(i);
                
                totalCIFP += objDepPrincipal.getCIPresupuestado();
                
                if(objEmpresa.getBaseAsignacionDeCosto().equals("Mano de Obra"))
                {
                    int indiceBaseMOPrincipal = objDepPrincipal.ObtenerIndiceDeBase("Mano de Obra", objEmpresa.getListaBases()),
                          indiceBaseMOOrden = objDepOrden.ObtenerIndiceDeBase("Mano de Obra", objEmpresa.getListaBases() );
                    
                    totalBasePresupuestada += objDepPrincipal.getListaBasesPresupuestadas().get(indiceBaseMOPrincipal).getHoras();
                    totalBaseReal += objDepOrden.getListaBasesParaOrden().get(indiceBaseMOOrden).getHoras();
                }
                else if(objEmpresa.getBaseAsignacionDeCosto().equals("Maquinaria"))
                {
                    int indiceBaseMaquinariaPrincipal = objDepPrincipal.ObtenerIndiceDeBase("Maquinaria", objEmpresa.getListaBases() ),
                          indiceBaseMaquinariaOrden = objDepOrden.ObtenerIndiceDeBase("Maquinaria", objEmpresa.getListaBases() );
                    
                    totalBasePresupuestada += objDepPrincipal.getListaBasesPresupuestadas().get( indiceBaseMaquinariaPrincipal).getHoras();
                     totalBaseReal += objDepOrden.getListaBasesParaOrden().get(indiceBaseMaquinariaOrden).getHoras();
                }*/
            }
            
            tasa =  totalCIFP / totalBasePresupuestada;
            CIFA = tasa * totalBaseReal;      
        }
        else if(objEmpresa.getTipoCifa().equals("Departamental"))
        {
            double tasaDep, CIFPdep, BasePresupuestadaDep = 0, BaseRealdep = 0, CIFAdep; //REAL = ORDEN
            
            Departamento dep;
            
            for(int i=0; i<objEmpresa.getListaDepartamentos().size(); i++)
            {
                dep = objEmpresa.getListaDepartamentos().get(i);
                
                CIFPdep = dep.getCIPresupuestado();
                
                if(dep.getNombreBaseTasaDepartamental().equals("Mano de Obra"))
                {
                    int indiceBaseMO = dep.ObtenerIndiceDeBase("Mano de Obra", dep.getListaBasesParaOrden());
                    
                    BasePresupuestadaDep = dep.getListaBasesPresupuestadas().get(indiceBaseMO).getHoras();
                    BaseRealdep = dep.getListaBasesParaOrden().get(indiceBaseMO).getHoras();
                }
                else if(dep.getNombreBaseTasaDepartamental().equals("Maquinaria"))
                {
                    int indiceBaseMA = dep.ObtenerIndiceDeBase("Maquinaria", dep.getListaBasesParaOrden());
                    
                    BasePresupuestadaDep = dep.getListaBasesPresupuestadas().get(indiceBaseMA).getHoras();
                    BaseRealdep = dep.getListaBasesParaOrden().get(indiceBaseMA).getHoras();
                }
                
                tasaDep = CIFPdep / BasePresupuestadaDep;
                CIFAdep = tasaDep * BaseRealdep;
                CIFA += CIFAdep;
                
                System.out.println("TASA DEL DEP: : " + tasaDep + "\n");
            }
        }
        
        orden.setImporteCifa(CIFA);
    }
}
