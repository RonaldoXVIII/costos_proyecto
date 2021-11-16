
package Lote_Controlador;

import Lote_Modelo.OrdenModel;
import Lote_Vista.LoteForm;

public class OrdenController
{
    OrdenModel objOrdenModel;

    public OrdenController(LoteForm objFrmPrincipal) 
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
