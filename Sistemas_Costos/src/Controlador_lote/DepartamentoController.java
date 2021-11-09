
package Controlador_lote;

import Modelo_lote.Departamento;
import Modelo_lote.DepartamentoModel;
import Vista_Lote.FrmPrincipal;
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
