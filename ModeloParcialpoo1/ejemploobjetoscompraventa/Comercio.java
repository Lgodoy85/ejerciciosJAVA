/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

import java.util.ArrayList;

/**
 *
 * String Dueño
 * arrayList Articulos
 * arrayList venta
 * @author alumno
 */
public class Comercio {
    private String _dueño;
    private ArrayList<articulo> _misArticulos;
    private ArrayList<Venta> _misVentas;
    
    public Comercio(String dueño)
    {
        this._dueño= dueño;
        this._misArticulos= new ArrayList<articulo>();
        this._misVentas= new ArrayList<Venta>();       
    }
    /*
    venderArticulo (artículo , cantidad)
mostrarArticulos
MostrarVentas
comprarArticulo(artículo , cantidad)
    */
    
    
    public void mostrarArticulos()
    {
        
    }
    public void mostrarVentas()
    {
        
    }
    
     public String ComprarArticulo(articulo art , int cantidad)
     {     
         for(articulo miart :this._misArticulos)
         {
             if(articulo.SonIguales(miart, art))
             {
                 miart.SetterStock(miart.GetterStock()+ art.GetterStock());
                 return "Se sumo al stock";                
             }
             
         }
         art.SetterStock(cantidad);
         this._misArticulos.add(art);
         return "se agrego uno nuevo";        
     }
     public String VenderArticulo(articulo art , int cantidad)
     {
          for(articulo miart :this._misArticulos)
         {
             if(articulo.SonIguales(miart, art))
             {
                if(miart.GetterStock()>cantidad)                    
                {
                    Venta nuevaVenta= new Venta(art,cantidad);
                    this._misVentas.add(nuevaVenta);
                    miart.SetterStock(miart.GetterStock()- cantidad);
                    return "pude vender";  
                }else
                {
                    return "no hay stock suficiente";
                }                             
             }            
         }
         return "no tengo el producto";
     }
}
