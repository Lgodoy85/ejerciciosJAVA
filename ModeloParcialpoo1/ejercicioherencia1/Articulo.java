package ejercicioherencia;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Articulo {
 
    private int _codigo;
    private String _nombre;
    private float _PrecioCosto;
    private float _PrecioVenta;
    private int _Stock;
    

    public Articulo(int _codigo, String _nombre, float _PrecioCosto,  int _Stock) {
        this._codigo = _codigo;
        this._nombre = _nombre;
        this._PrecioCosto = _PrecioCosto;
        this._PrecioVenta= (float) _PrecioCosto * (float) 1.25;
        this._Stock = _Stock;
    }
    
    public int GetStock (){
    
        return this._Stock;
    
    }
         
    public String GetNombreyGetCodigo()//devuelve el nombre del articulo
    {
        
        return this._nombre+this._codigo;
      
    }  

    public double getPrecioVenta() {
        return _PrecioVenta;
    }

    public void setPrecioCosto(float PrecioCosto) {
        this._PrecioCosto = PrecioCosto;
    }

    public void setStock(int _Stock) {
        this._Stock = _Stock;
    }

    public double getPrecioCosto() {
        return _PrecioCosto;
    }
 
    
    public boolean Haystock (){
        
////si hay stock return true sino false
//ejemplo 1 de retornar un stock
//        if (this._Stock <= 1) {
// 
//        return false;
//            
//        }
// 
//        return true;
//        
//        }


//ejemplo 2 de retornar un stock

       boolean retorno = false;

       if (this._Stock>0){

       return true; }

       return retorno;
   
       }

//forma 3 de return un stock
//{    return (this._Stock>0);
//            
//            }
    
    
    
     public static boolean SonIguales(Articulo uno, Articulo dos) //verifica si dos articulos son iguales, 
    {   boolean retorno=false;
    
        if (uno.GetNombreyGetCodigo().equalsIgnoreCase(dos.GetNombreyGetCodigo()))
        {
            retorno = true;
        }
        
        return retorno;
        
     
     }
     public void MostrarArticulo (){
     
         StringBuilder Mostrar = new StringBuilder();
         Mostrar.append("nombre : "+this._nombre);
         Mostrar.append("Codigo : "+this._codigo);
         Mostrar.append("Precio costo : "+this._PrecioCosto);
         Mostrar.append("Precio Venta : "+this._PrecioVenta);
         Mostrar.append("Stock  : "+this._Stock);
     
     }
 
    }
    
    
