/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

/**
 *
 * @author alumno
 */
public class articulo {
    private int _codigo;
    private String _nombre;
    private float _precioCosto;
    private float _precioVenta;
    private int _stock;
    
    public articulo(int codigo,String nombre, float precioCosto,int stock)
    {
        this._codigo=codigo;
        this._nombre=nombre;
        this._precioCosto=precioCosto;
        this._stock=stock;
        this._precioVenta = (float)precioCosto* (float)1.25;
        /*
        
        */
        
    }
    public Boolean HayStock()
    {


//        if(this._stock<1)
//        {
//            return false;
//        }
//        return true;
        
        
//        boolean retorno= false;
//        if(this._stock>0)
//        {
//            retorno= true;
//        }
//        return retorno;
        
        
        return(this._stock>0);
    }     
    
    public void MostrarArticulo()
    {
        System.out.println("todos los datos");
      
    }
    
    public static boolean SonIguales(articulo uno , articulo dos)
    {
        boolean retorno=false;       
        if(uno.GetterNombreYcodigo().equals(dos.GetterNombreYcodigo()))
        {
            retorno= true;
        }       
        return retorno;
    }
    
    /*
    los getter siempre retornan algo
    */
    public float GetterPrecioVenta()
    {
        return this._precioVenta;
    }
    public String GetterNombreYcodigo()
    {
        return this._nombre+this._codigo;
    }
    
    public int GetterStock()
    {
        return this._stock;
    }
    
    public float GetterGanancia()
    {
        return this._precioVenta+this._precioCosto;
    }
    
    /*
    los setter simepre tienen parametros de ingreso y retorn void
    */
    public void SetterCosto(float paramCosto)
    {
        this._precioCosto= paramCosto;
    }
      public void SetterStock(int paramStock)
    {
        this._stock= paramStock;
    }
    
    /*

Constructor que reciba todos los atributos por parámetros 
 menos el precio venta que se
calcula con un 25% de incremento sobre el precio de costo.
Métodos:
Instancia
HayStock :bool
Static
SonIguales(articulo uno articulo dos) :bool Compara el nombre y el código.
    */
}
