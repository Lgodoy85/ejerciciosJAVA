/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class ArticuloComestible extends articulo{
    
    private String _fechaVencimiento;
    public ArticuloComestible(int codigo,String nombre, float precioCosto,int stock,String fecha )
    {
        super(codigo,nombre,precioCosto,stock );
        this._fechaVencimiento= fecha;
        
    }
}
