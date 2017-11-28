package ejercicioherencia1;

public class Venta {
   
    
    Articulo _ArticuloVendido;
    int _cantidad;

    public Venta(Articulo ArticuloVendido, int cantidad) { //constructor
        
     if (ArticuloVendido.Haystock(ArticuloVendido.GetNombre(), cantidad)) //verificacion de stock
     {   this._ArticuloVendido = ArticuloVendido;
        this._cantidad = cantidad; 
    } else
     {
         System.out.println(" No hay Stock ");
     }

    }
    
    public void MostrarVenta (){
    
        StringBuilder Ventas = new StringBuilder();
        Ventas.append("Articulo vendido : "+this._ArticuloVendido.GetNombre());
        Ventas.append("Precio : "+this._ArticuloVendido.getPrecioVenta());
        Ventas.append("cantidad vendida : " + this._cantidad);
    
    }
    
    public double RetornarGanancias (){
    
        double calcular = 0;
        double retorno = 0;
        
        double costo = this._ArticuloVendido.getPrecioVenta();
        double venta = this._ArticuloVendido.getPrecioCosto();
        
        if (this._ArticuloVendido!=null){
        
            calcular = (costo*this._cantidad)-(venta*this._cantidad);
            retorno = calcular;
        }
        
       return retorno;        
    
    }
    
    public void MostrarGanancias(){
    
        StringBuilder Ganancia = new StringBuilder();
        Ganancia.append("La ganancia total es : "+this.RetornarGanancias());
    
    }
    
    
}
