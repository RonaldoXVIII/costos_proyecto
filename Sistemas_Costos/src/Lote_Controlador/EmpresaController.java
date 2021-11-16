
package Lote_Controlador;

import Lote_Modelo.Empresa;
import Lote_Modelo.EmpresaModel;
import Lote_Vista.LoteForm;

public class EmpresaController 
{
    EmpresaModel objEmpresaModel;

    public EmpresaController(LoteForm objFrmPrincipal) 
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
