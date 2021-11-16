/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso_Controlador;

import Proceso_Modelo.Departamento;
import Proceso_Vista.ProcesoForm;
import Proceso_Modelo.Costo;
import Proceso_Modelo.Unidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class ControladorDepartamento implements ActionListener{
    
    private Departamento departamento;
    private ProcesoForm vistaProceso;
    DecimalFormat formatter = new DecimalFormat("#.###");
    
    public ControladorDepartamento(Departamento d,ProcesoForm v)
    {
        this.departamento = d;
        this.vistaProceso = v;
        this.vistaProceso.btnCalcular.addActionListener(this);
    }
    
    
    public void iniciar()
    {
        vistaProceso.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
   
    String nombre;
    Unidad unidadesTerminadas;
    Unidad unidadesIniciadas=null;
    Costo costoInicial,costoFinal;
    Unidad uep_inicial;
    Unidad uep_final;
    Costo costoUnidad=null;
    
    
    nombre = vistaProceso.txtNombreDep.getText();
    
    unidadesTerminadas = new Unidad(
    Double.parseDouble(vistaProceso.txtTasaUnidadesTerminadasCC.getText()),
            Double.parseDouble(vistaProceso.txtTasaUnidadesTerminadasCM.getText()),
            costoUnidad = new Costo(0,0),
            Integer.parseInt(vistaProceso.txtUnidadesTerminadasCantidad.getText()),
            "TERMINADO"
    );
    
    uep_inicial = new Unidad(
            Double.parseDouble(vistaProceso.txtTasaUepInicialCC.getText()),
            Double.parseDouble(vistaProceso.txtTasaUepInicialCM.getText()),
            costoUnidad = new Costo(0,0),
            Integer.parseInt(vistaProceso.txtUepInicialCantidad.getText()),
            "UEP/INICIAL"
    );
    
        uep_final = new Unidad(
            Double.parseDouble(vistaProceso.txtTasaUepFinalCC.getText()),
            Double.parseDouble(vistaProceso.txtTasaUepFinalCM.getText()),
            costoUnidad = new Costo(0,0),
            Integer.parseInt(vistaProceso.txtUepFinalCantidad.getText()),
            "UEP/FINAL");
                
                costoInicial = new Costo(
                        Double.parseDouble(vistaProceso.txtCostoInicialMaterial.getText()),
                        Double.parseDouble(vistaProceso.txtCostoInicialConversion.getText())
                );
                
                costoFinal = new Costo(
                        Double.parseDouble(vistaProceso.txtCostoFinalMaterial.getText()),
                        Double.parseDouble(vistaProceso.txtCostoFinalConversion.getText())
                );
                
                departamento = new Departamento(nombre, unidadesTerminadas, unidadesIniciadas, costoInicial, costoFinal, uep_inicial, uep_final);

                ejecucion();
    }
    
public void ejecucion()
{
    if(vistaProceso.cbMetodo.getSelectedIndex()==0)
        {
            departamento.procesandoInformacion(true);
            vistaProceso.txtPorUnidadMaterial.setText(formatter.format(departamento.costoE_porUnidadMaterial(true))+"");
            vistaProceso.txtPorUnidadCC.setText(formatter.format(departamento.costoE_porUnidadCC(true))+"");
            //Costos por contabilizar
            vistaProceso.txtPorUnidadTotal.setText(formatter.format(departamento.costoE_Total(true))+"");
            
            vistaProceso.txtCostoCCContabilizar.setText(formatter.format(departamento.getCostoFinal().getCostoConversion())+"");
            vistaProceso.txtCostoMaterialContabilizar.setText(formatter.format(departamento.getCostoFinal().getCostoMaterial())+"");
            
            
            vistaProceso.txtCostoUEPinicial.setText(formatter.format(departamento.costoContabilizadoUEPInicial(true))+"");
            vistaProceso.txtCostoUEPFinal.setText(formatter.format(departamento.costoContabilizadoUEPFinal(true))+"");
            
            vistaProceso.txtCostoUTerminadas.setText(formatter.format(departamento.costoContabilizadoUTerminadas(true))+"");
            
            
        } else {
            
            departamento.procesandoInformacion(false);
            vistaProceso.txtPorUnidadMaterial.setText(formatter.format(departamento.costoE_porUnidadMaterial(false))+"");
            vistaProceso.txtPorUnidadCC.setText(formatter.format(departamento.costoE_porUnidadCC(false))+"");
            vistaProceso.txtPorUnidadTotal.setText(formatter.format(departamento.costoE_Total(false))+"");
            //Costos por contabilizar
            vistaProceso.txtCostoMaterialContabilizar.setText(formatter.format(departamento.costosContabilizarMateriales())+"");
            vistaProceso.txtCostoCCContabilizar.setText(formatter.format(departamento.costosContabilizarCC())+"");
                      
            vistaProceso.txtCostoUEPinicial.setText(formatter.format(departamento.costoContabilizadoUEPInicial(false))+"");
            vistaProceso.txtCostoUEPFinal.setText(formatter.format(departamento.costoContabilizadoUEPFinal(false))+"");
            vistaProceso.txtCostoUTerminadas.setText(formatter.format(departamento.costoContabilizadoUTerminadas(false))+"");
            
            
    }
        
            vistaProceso.txtRUnidadesCyT.setText(formatter.format(departamento.unidades_cyt())+"");
            vistaProceso.txtRUnidadesComenzadas.setText(formatter.format(departamento.unidades_comenzadas())+"");
            vistaProceso.txtRUepInicial.setText(formatter.format(departamento.getUep_inicial().getCantidad())+"");
            vistaProceso.txtRUepFinal.setText(formatter.format(departamento.getUep_final().getCantidad())+"");
            
            vistaProceso.txtUEConversionCC.setText(formatter.format(departamento.getUeCConversion())+"");
            vistaProceso.txtUEConversionCM.setText(formatter.format(departamento.getUeMateriales())+"");

            vistaProceso.txtCostoTotalContabilizado.setText(formatter.format(departamento.getCostoContabilizado())+"");
            vistaProceso.txtCostoTotalContabilizar.setText(formatter.format(departamento.getCostoContabilizar())+"");
            
}



    
    
}



