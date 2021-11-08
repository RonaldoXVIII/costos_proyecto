
package Modelo;

import Vista.FrmPrincipal;
import javax.swing.JOptionPane;

public class EmpresaModel
{
    private Empresa empresa;
    FrmPrincipal objFrmPrincipal;

    public EmpresaModel(FrmPrincipal objFrmPrincipal) 
    {
        this.objFrmPrincipal = objFrmPrincipal;
    }
    
    public void CrearEmpresa()
    {
        String nombre = objFrmPrincipal.txtNombreEmpresa.getText(),
                    modalidad = objFrmPrincipal.cboModalidad.getSelectedItem().toString(),
                    tipoCifa = objFrmPrincipal.cboTipoCifa.getSelectedItem().toString();
        
        empresa = new Empresa(nombre, modalidad, tipoCifa);
        
        JOptionPane.showMessageDialog(null,"EMPRESA CREADA EXITOSAMENTE!");
        
        switch(modalidad)
        {
            case "Real": objFrmPrincipal.txtCIPresupuestado.setEnabled(false);
                                  objFrmPrincipal.txtHMOPresupuestadas.setEnabled(false);
                                  objFrmPrincipal.txtHMaquinaPresupuestadas.setEnabled(false); break;
                                  
            case "Presupuestado": objFrmPrincipal.txtCIReales.setEnabled(false);
                                                      objFrmPrincipal.txtHMOReales.setEnabled(false);
                                                      objFrmPrincipal.txtHMaquinaReales.setEnabled(false); break;
        }
        
        if(tipoCifa.equals("Departamental"))    
            objFrmPrincipal.pnlBaseParaTasaDepartamental.setVisible(true);     
        
        objFrmPrincipal.pnlBaseParaEmpresa.setVisible(true);
        objFrmPrincipal.pnlBaseAsignacionCostos.setVisible(true);
    }
    
    public void AgregarBase()
    {
        String nombreBase = objFrmPrincipal.cboBaseParaEmpresa.getSelectedItem().toString();

        if(nombreBase.equals("Mano de Obra") || nombreBase.equals("Maquinaria"))
        {
            Base base = new Base(nombreBase);          
            empresa.addBase(base);
            
            JOptionPane.showMessageDialog(null,"BASE " + nombreBase + " AGREGADA A LA EMPRESA!");
            
             objFrmPrincipal.cboBaseAsignacionCosto.addItem(nombreBase);
             objFrmPrincipal.cboBaseParaTasaDep.addItem(nombreBase);
                     
             if(nombreBase.equals("Mano de Obra"))
             {
                 objFrmPrincipal.pnlHorasMO.setVisible(true);
                 objFrmPrincipal.pnlOrdenMO.setVisible(true);
             }                      
             else if(nombreBase.equals("Maquinaria"))
             {
                 objFrmPrincipal.pnlHorasMA.setVisible(true);      
                 objFrmPrincipal.pnlOrdenMA.setVisible(true);
             }                     
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PORFAVOR, SELECCIONE UNA BASE VÁLIDA!!!");
        }
    }
    
    public void EstablecerBaseAsignacionCostos()
    {
        String nombreBaseAsignacionCosto =  objFrmPrincipal.cboBaseAsignacionCosto.getSelectedItem().toString();
        
        empresa.setBaseAsignacionDeCosto(new Base(nombreBaseAsignacionCosto));     
        
        if(nombreBaseAsignacionCosto.equals("Mano de Obra"))
        {
            objFrmPrincipal.txtCostoPorHMaquina.setEnabled(false);
            objFrmPrincipal.txtCostoPorHMO.setEnabled(true);
            JOptionPane.showMessageDialog(null,"BASE ASIGNACION DE COSTO ESTABLECIDA COMO MANO DE OBRA!");
        }
        else if(nombreBaseAsignacionCosto.equals("Maquinaria"))
        {
                objFrmPrincipal.txtCostoPorHMO.setEnabled(false);
                objFrmPrincipal.txtCostoPorHMaquina.setEnabled(true);
                JOptionPane.showMessageDialog(null,"BASE ASIGNACION DE COSTO ESTABLECIDA COMO MAQUINARIA!");
        }
        
    }
    
    public void EstablecerDepartamentos()
    {
        empresa.setListaDepartamentos(objFrmPrincipal.objDepartamentoController.obtenerController());
        JOptionPane.showMessageDialog(null,"SE ESTABLECIERON LOS DEPARTAMENTOS DE LA EMPRESA!");
    }
    
    public Empresa ObtenerEmpresa() throws CloneNotSupportedException
    {    
        return  (Empresa)empresa.clone();
    }
    
 /*   public void GenerarOrden()
    {
        int numero = Integer.parseInt(objFrmPrincipal.txtNumeroOrden.getText()), 
              unidades = Integer.parseInt(objFrmPrincipal.txtUnidades.getText());
        double importeMaterialDirecto = Double.parseDouble(objFrmPrincipal.txtImporteMaterialDirecto.getText());
  
        
    }       */

    public Empresa getEmpresa() 
    {
        return empresa;
    }
    
}
