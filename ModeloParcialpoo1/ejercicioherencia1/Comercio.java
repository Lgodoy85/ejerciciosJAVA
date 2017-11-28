package ejercicioherencia;

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
        this._articulo= new ArrayList<Articulo>();
        this._venta= new ArrayList<Venta>();
    }
   
    
    public String ComprarArticulos (Articulo art , int cantidad ){
          
        for (Articulo articulo1 : this._articulo) {
            if (Articulo.SonIguales(articulo1, art)){
        
                articulo1.setStock((int) (articulo1.GetStock()+ art.getPrecioVenta()));
                return "se sumo al stock";          
        }
        }
        art.setPrecioCosto(cantidad);
        this._articulo.add(art);
        return "se agrego uno nuevo";
        
    }
    
      public String VenderArticulo (Articulo art1 , int cantidad){
    
        for (Articulo articulo1 : this._articulo) {
            if (Articulo.SonIguales(articulo1, art1)){
        
                if (art1.GetStock()>cantidad) {
                    
                  Venta NuevaVenta = new Venta(art1, cantidad);
                  this._venta.add(NuevaVenta);             
                  articulo1.setStock(art1.GetStock()-cantidad);
                  
                    return "pude vender";
                } 
                else
                {
                    return "no hay stock suficiente";
                    
                }
                    
                }
            }
        return "no tegno producto";
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