
package Modelo;

import Vista.FrmPrincipal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class DepartamentoModel 
{   
    private Departamento departamento;
    private ArrayList<Departamento> listaDepartamentos;
    FrmPrincipal objFrmPrincipal;

    public DepartamentoModel (FrmPrincipal objFrmPrincipal) 
    {
        this.objFrmPrincipal = objFrmPrincipal;
        listaDepartamentos = new ArrayList<Departamento>();
    }
    
    public void AgregarDepartamento() throws CloneNotSupportedException
    {       
        
        Empresa objEmpresa = objFrmPrincipal.objEmpresaController.ObtenerEmpresaController();
        String modalidad = objEmpresa.getModalidad();
        
        String nombre = objFrmPrincipal.txtNombreDepartamento.getText();
        ArrayList<Base> listaBases = new ArrayList<Base>();
        listaBases.addAll(objEmpresa.getListaBases());
        
        ArrayList<Base> listaBasesPresupuestadas = new ArrayList<Base>();// new ArrayList<Base>(listaBases);
        ArrayList<Base> listaBasesReales = new ArrayList<Base>();       
        
        
        for(Base base: listaBases)
        {
            listaBasesPresupuestadas.add((Base)base.clone());
            listaBasesReales.add((Base)base.clone());
        }
        
        double CIPresupuestado, CIReal;
        
        switch(modalidad)
        {
            case "Real": CIReal = Double.parseDouble(objFrmPrincipal.txtCIReales.getText()); 
                                                departamento = new Departamento(CIReal, nombre);
                                   
                                  for(int i=0; i<listaBases.size(); i++)
                                  {
                                      if(listaBases.get(i).getNombre().equals("Mano de Obra"))                              
                                          listaBasesReales.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMOReales.getText()));                                    
                                      else if(listaBases.get(i).getNombre().equals("Maquinaria"))                                 
                                          listaBasesReales.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMaquinaReales.getText()));                                   
                                  }   break;
                                  
            case "Presupuestado": CIPresupuestado = Double.parseDouble(objFrmPrincipal.txtCIPresupuestado.getText()); 
                                                    departamento = new Departamento(nombre, CIPresupuestado); 
                                                    
                                  for(int i=0; i<listaBases.size(); i++)
                                  {
                                      if(listaBases.get(i).getNombre().equals("Mano de Obra"))                              
                                          listaBasesPresupuestadas.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMOPresupuestadas.getText()));                                    
                                      else if(listaBases.get(i).getNombre().equals("Maquinaria"))                                  
                                          listaBasesPresupuestadas.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMaquinaPresupuestadas.getText()));                                   
                                  }  break;
       
            case "Real y Presupuestado": CIReal = Double.parseDouble(objFrmPrincipal.txtCIReales.getText()); 
                                                               CIPresupuestado = Double.parseDouble(objFrmPrincipal.txtCIPresupuestado.getText()); 
                                                               departamento = new Departamento(nombre, CIPresupuestado, CIReal);
                                                               
                                  for(int i=0; i<listaBases.size(); i++)
                                  {
                                      if(listaBases.get(i).getNombre().equals("Mano de Obra"))
                                      {
                                          listaBasesReales.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMOReales.getText()));     
                                          listaBasesPresupuestadas.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMOPresupuestadas.getText()));                                      
                                      }                                               
                                      else if(listaBases.get(i).getNombre().equals("Maquinaria"))  
                                      {
                                          listaBasesReales.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMaquinaReales.getText()));
                                          listaBasesPresupuestadas.get(i).setHoras(Integer.parseInt(objFrmPrincipal.txtHMaquinaPresupuestadas.getText()));
                                      }                                 
                                                                            
                                  }  break;
        }

        departamento.setListaBasesPresupuestadas(listaBasesPresupuestadas);
        departamento.setListaBasesReales(listaBasesReales);
        
        if(objEmpresa.getTipoCifa().equals("Departamental"))
             departamento.setNombreBaseTasaDepartamental(objFrmPrincipal.cboBaseParaTasaDep.getSelectedItem().toString());      
        
        listaDepartamentos.add(departamento);
        JOptionPane.showMessageDialog(null, "DEPARTAMENTO " + departamento.getNombre() +" AGREGADO CON EXITO!");
        
        int indiceMO = departamento.ObtenerIndiceDeBase("Mano de Obra", listaBases);
        int indiceMA = departamento.ObtenerIndiceDeBase("Maquinaria", listaBases);
        System.out.println("INDICE DE MANO DE OBRA: " + indiceMO);
        System.out.println("INDICE DE MAQUINARIA: " + indiceMA);
        System.out.println("DEPARTAMENTO: " + departamento.getNombre()
                                        + "\nCOSTOS INDIRECTOS PRESUPUESTADOS: " + departamento.getCIPresupuestado()
                                        + "\nCOSTOS INDIRECTOS REALES: " + departamento.getCIReal()
                                        + "\nHORAS " + departamento.getListaBasesPresupuestadas().get(indiceMO).getNombre() + " PRESUPUESTADAS: " + departamento.getListaBasesPresupuestadas().get(indiceMO).getHoras()
                                        + "\nHORAS " + departamento.getListaBasesReales().get(indiceMO).getNombre() + " REALES: " + departamento.getListaBasesReales().get(indiceMO).getHoras()
                                        + "\nHORAS " + departamento.getListaBasesPresupuestadas().get(indiceMA).getNombre() + " PRESUPUESTADAS: " + departamento.getListaBasesPresupuestadas().get(indiceMA).getHoras()
                                        + "\nHORAS " + departamento.getListaBasesReales().get(indiceMA).getNombre() + " REALES: " + departamento.getListaBasesReales().get(indiceMA).getHoras() + "\n");
        
        System.out.println("\nBASES DEL DEPARTAMENTO: ");
        
        for(int i=0; i<departamento.getListaBasesPresupuestadas().size(); i++)
        {
            Base basesDep = departamento.getListaBasesPresupuestadas().get(i);
            System.out.println("BASE " + basesDep.getNombre() + " PRESUPUESTADO = " + basesDep.getHoras());
            
            basesDep = departamento.getListaBasesReales().get(i);
            System.out.println("BASE " + basesDep.getNombre() + " REAL = " + basesDep.getHoras());
        }
        
        objFrmPrincipal.txtNombreDepartamento.setText("");
        objFrmPrincipal.txtCIPresupuestado.setText("");
        objFrmPrincipal.txtCIReales.setText("");
        objFrmPrincipal.txtHMOPresupuestadas.setText("");
        objFrmPrincipal.txtHMOReales.setText("");
        objFrmPrincipal.txtHMaquinaPresupuestadas.setText("");
        objFrmPrincipal.txtHMaquinaReales.setText("");
    }   
    
    /*
    public void EstablecerBasesParaOrden()
    {
        Empresa objEmpresa = objFrmPrincipal.objEmpresaController.ObtenerEmpresaController();
        Base objBaseAsignadaCostos = objEmpresa.getBaseAsignacionDeCosto();
        String nombreBaseAsigCos = objBaseAsignadaCostos.getNombre();
        
        int horasMO = Integer.parseInt(objFrmPrincipal.txtHMO.getText()),
              horasMA = Integer.parseInt(objFrmPrincipal.txtHMaquina.getText());        
        
        if(nombreBaseAsigCos.equals("Mano de Obra"))
        {
            double costoPorHoraMO = Double.parseDouble(objFrmPrincipal.txtCostoPorHMO.getText());   
        }                  
        else
        {
             double costoPorHoraMA = Double.parseDouble(objFrmPrincipal.txtHMaquina.getText());
        }      
        
    }*/
    
    public List<Departamento> ObtenerListaDepartamentos()
    {
        return Collections.unmodifiableList(this.listaDepartamentos);
    }
}
