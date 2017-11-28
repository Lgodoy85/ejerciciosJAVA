package ejercicioherencia1;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class Articulo {
 
    private int _codigo;
    private String _nombre;
    private double _PrecioCosto;
    private double _PrecioVenta;
    private int _Stock;
    
    
    //el precioventa que se calcula con un 25% de
    //incremento sobre el precio de costo.   
 

    public Articulo(int _codigo, String _nombre, double _PrecioCosto,  int _Stock) {
        this._codigo = _codigo;
        this._nombre = _nombre;
        this._PrecioCosto = _PrecioCosto;
        this._PrecioVenta= _PrecioCosto*1.25;
        this._Stock = _Stock;
    }
    
    public String GetNombre()//devuelve el nombre del articulo
    {
        String retorno=this._nombre;
        
        return retorno;
    }
    
    public int getCodigo() {
        return _codigo;
    }

    public double getPrecioVenta() {
        return _PrecioVenta;
    }

    public void setPrecioCosto(int _PrecioCosto) {
        this._PrecioCosto = _PrecioCosto;
    }

    public void setStock(int _Stock) {
        this._Stock = _Stock;
    }

    public double getPrecioCosto() {
        return _PrecioCosto;
    }
 
    
    public boolean Haystock (String nombre, int sto){

        boolean retorno = false;
        if (nombre.equalsIgnoreCase(this._nombre) && this._Stock <= sto) {
 
            return retorno = true;
 
        } else {
 
            System.err.println("Error. Quedan " + this._Stock + " unidades");
 
            return retorno = false;
        }
    }
    
     public static boolean SonIguales(Articulo uno, Articulo dos) //verifica si dos articulos son iguales, 
    {   boolean retorno=false;
    
        if (uno._nombre.equalsIgnoreCase(dos._nombre) && (uno._codigo==dos._codigo)) 
        {
            return retorno = true;
        }else
        {
            return retorno=false;
            
        }
        
        

        
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
    
    
    
    

     

