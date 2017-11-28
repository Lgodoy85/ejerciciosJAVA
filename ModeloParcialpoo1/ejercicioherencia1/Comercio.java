package ejercicioherencia1;
import java.util.ArrayList;


/*Creamos la clase Comercio que tiene un string dueño y tiene arraylist de articulos y va a tener otro
arraylist de venta. El constructor recibe el nombre del dueño.
Metodo Vender articulo recibe un articulo y una cantidad , esto crea una nueva venta y lo manda
a nuestro arraylistventa. Mostrararticulos y mostrarventas dentro de la clase articulo que muestre
todo y comprararticulos,recibe articulos y cantidad , lo mismo que vender.
Listado de ventas y de lo que vendio.
*/
public class Comercio {
 
    private String _Dueño;
    ArrayList<Articulo> _articulo;
    ArrayList<Venta> _venta;

    public Comercio(String _Dueño) {
        this._Dueño = _Dueño;
    }
    
    public void VenderArticulo (Articulo articulo , int cantidad){
    
        this._venta = new ArrayList<>();
    
    }
   
    
    public void ComprarArticulos (Articulo articulo , int cantidad ){
        
        this._articulo = new ArrayList<>();
    
    }
    
    public void MostrarArticulos (){
    
        for (Articulo articulo : _articulo) {
            articulo.MostrarArticulo();
            
        }
    
    }
    
    public void MostrarVentas (){
    
        for (Venta listadodeventas : _venta) {
            
            listadodeventas.MostrarVenta();
            
        }
            
        }
            
    
    }
    
    
    

