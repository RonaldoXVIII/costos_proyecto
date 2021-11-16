
package Lote_Controlador;

import Lote_Modelo.Departamento;
import Lote_Modelo.DepartamentoModel;
import Lote_Vista.LoteForm;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoController
{
    DepartamentoModel objDepartamentoModel;

    public DepartamentoController(LoteForm objFrmPrincipal) 
    {
        objDepartamentoModel= new DepartamentoModel(objFrmPrincipal);
    }
    
    public void agregarController() throws CloneNotSupportedException
    {
        objDepartamentoModel.AgregarDepartamento();
    }
    
    public List<Departamento> obtenerController()
    {
        return objDepartamentoModel.ObtenerListaDepartamentos();
    }
}
