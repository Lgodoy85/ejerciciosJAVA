package ejemploobjetoscompraventa;

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
    
      public void MostrarVenta()//muestra la venta
   {   
            System.out.println(""+this._cantidad);
            System.out.println("Articulo: ");
            this._articuloVendido.MostrarArticulo();
    }
    
}
