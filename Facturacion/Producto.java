/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.facturacion;

/**
 *
 * @author alumno
 */
public class Producto {
   
    private String _descripcion;
    private float _precio;
    private int _cantidad;
    
    public static Producto RetornarProductoRnaomd(){
    
        Producto retorno = new Producto ();
        retorno._cantidad = 4;
        retorno._descripcion="";
        retorno._precio=6;
        
        
        
        return retorno;
    
    }
    
    public void SetterDescrip (String des){
    
        this._descripcion=des;
    }
    public void Setterprecio (float precio){
    
        this._precio = precio;
    }
    public void SetterCant (int cant){
    
        this._cantidad=cant;
    
    }
    public void MostrarProducto (){
    
        System.out.println(" El producto es : "+ this._descripcion);
        System.out.println(" La cantidad es  : "+ this._cantidad);
        System.out.println(" El precio es :  "+this._precio);
           
    }
    
    public float DameElPrecioFinal (){
    
        float retorno=0;
        
        retorno = this._precio*
                this._cantidad;
        
        
        return retorno;
        
    }
    
            
    
    
}
