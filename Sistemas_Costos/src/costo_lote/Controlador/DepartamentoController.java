
package Controlador;

import Modelo.Departamento;
import Modelo.DepartamentoModel;
import Vista.FrmPrincipal;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoController
{
    DepartamentoModel objDepartamentoModel;

    public DepartamentoController(FrmPrincipal objFrmPrincipal) 
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
