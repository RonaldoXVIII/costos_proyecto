
package Controlador;

import Modelo.OrdenModel;
import Vista.FrmPrincipal;

public class OrdenController
{
    OrdenModel objOrdenModel;

    public OrdenController(FrmPrincipal objFrmPrincipal) 
    {
        objOrdenModel = new OrdenModel(objFrmPrincipal);
    }
    
    public void CrearController() throws CloneNotSupportedException
    {
        objOrdenModel.CrearOrden();
    }
    
    public void LlenarBaseDepartamentoController() throws CloneNotSupportedException
    {
        objOrdenModel.LlenarBaseDepartamento();
    }
    
    public void GenerarOrdenController() throws CloneNotSupportedException
    {
         objOrdenModel.GenerarOrden();
    }
}
