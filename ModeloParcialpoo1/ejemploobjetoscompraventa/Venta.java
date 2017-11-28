/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

/**
    *ArticuloVendido : Articulo
    *Cantidad:int
    *Constructor con los dos parametros
    *Métodos: RetronarGanancia():float
    * @author alumno
 */
public class Venta {
    private articulo _articuloVendido;
    private int _cantidad;
    
    public Venta(articulo artUno, int cantidad)
    {
        this._articuloVendido=artUno;
        this._cantidad= cantidad;        
    }
    public float RetornarGanacia()
    {
      float preciofacturado=  this._articuloVendido.GetterPrecioVenta()*this._cantidad;
      return preciofacturado;  
    }
    
}
