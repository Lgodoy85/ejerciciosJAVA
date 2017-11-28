package ejercicioherencia;
public class Venta {
   
    
    private Articulo _ArticuloVendido;
    private int _cantidad;

    public Venta(Articulo ArticuloVendido, int cantidad) { //constructor
        

       this._ArticuloVendido=ArticuloVendido;
       this._cantidad=cantidad;
       
    }
    
    public void MostrarVenta (){
    
        StringBuilder Ventas = new StringBuilder();
        Ventas.append("Articulo vendido : "+this._ArticuloVendido.GetNombreyGetCodigo());
        Ventas.append("Precio : "+this._ArticuloVendido.getPrecioVenta());
        Ventas.append("cantidad vendida : " + this._cantidad);
    
    }
    
    public float RetornarGanancias (){
    
        float calcular = 0;
        float retorno = 0;
        
        float costo = (float) (this._ArticuloVendido.getPrecioCosto()*this._cantidad);
        float venta = (float) (this._ArticuloVendido.getPrecioCosto()*this._cantidad);
        
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