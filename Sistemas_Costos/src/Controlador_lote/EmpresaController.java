
package Controlador_lote;

import Modelo_lote.Empresa;
import Modelo_lote.EmpresaModel;
import Vista_Lote.FrmPrincipal;

public class EmpresaController 
{
    EmpresaModel objEmpresaModel;

    public EmpresaController(FrmPrincipal objFrmPrincipal) 
    {
        objEmpresaModel = new EmpresaModel(objFrmPrincipal);
    }
    
    public void CrearController()
    {
        objEmpresaModel.CrearEmpresa();
    }
    
    public void AgregarBaseController()
    {
        objEmpresaModel.AgregarBase();
    }
    
    public void EstablecerBaseAsignacionCostoController()
    {
        objEmpresaModel.EstablecerBaseAsignacionCostos();
    }
    
    public Empresa ObtenerEmpresaController() throws CloneNotSupportedException
    {
        return (Empresa)objEmpresaModel.ObtenerEmpresa().clone();
    }
    
    public Empresa getEmpresaController() 
    {
        return objEmpresaModel.getEmpresa();
    }    

    public void EstablecerDepartamentosController()
    {
        objEmpresaModel.EstablecerDepartamentos();
    }    
}
