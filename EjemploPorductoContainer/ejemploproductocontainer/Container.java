package ejemploproductocontainer;
import java.util.ArrayList;


public class Container {
  
    private int _capacidad;
    ArrayList<Producto> _listadodeproducto;
    
    
    
    public Container( int capacidad){
    
    this._listadodeproducto= new ArrayList<Producto>();
    this._capacidad=capacidad;
    
    }
     
    public void Ordenar(){
    
        for (int i = 0; i < this._listadodeproducto.size(); i++) {
            
            for (int j = 0; j < this._listadodeproducto.size()-1; j++) {
                
                if (this._listadodeproducto.get(j)._precio<this._listadodeproducto.get(j+1)._precio){
                    
                    Producto aux;
                    aux=this._listadodeproducto.get(j);
                    this._listadodeproducto.set(j, this._listadodeproducto.get(j+1));
                    this._listadodeproducto.set(j+1,aux);
                
                
                }
                
            }
            
        }
    
    
    }
    
    
    public float GetterPrecioTotal()
    {
        float retorno = 0;
        
        for (Producto auxproducto : this._listadodeproducto) {
            retorno = retorno+GetterPrecioTotal();
            
        }  
        return retorno;
        
    }
    
    public int MostrarCantidadProductos(){
    
        int retorno = this._listadodeproducto.size();
        
        
        return retorno;
    
    }
    
    public int GetCantidadDeProductos (){
    
        int retorno =this._listadodeproducto.size();
        
        return retorno;
    
    }
    public int GetCantidadDeLugaresLibres (){
    
        int retorno = this._capacidad-this._listadodeproducto.size();
        
        return retorno;
    
    }
    
    public void MostrarContainer()
    {
        
        System.out.println(" capacidad total " +this._capacidad);
        System.out.println(" cantidad de productos " +GetCantidadDeProductos());
        System.out.println(" luigares libres " +GetCantidadDeLugaresLibres());
        
        int contador=0;
        for (Producto prod : this._listadodeproducto) {
        
        prod.MostrarProducto();
        System.out.println(" El precio es :  " + prod.GetterPrecio());
        contador++;
        
        }
    }
    
    public boolean CargarProducto (Producto unproducto){
        if (this.GetCantidadDeLugaresLibres()>0){
            
          this._listadodeproducto.add(unproducto);
          return true; 
        }
        return false; 
    }
    
    public String tString (){
    
        return (" Esto es importado " + this._listadodeproducto + this._capacidad);
    
    }
   
    
    
    
}
