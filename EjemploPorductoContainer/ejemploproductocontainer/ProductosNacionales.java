package ejemploproductocontainer;

public class ProductosNacionales extends Producto {
 
    private String _provincia;

    public ProductosNacionales(String _provincia, int _id, String _nombre, float _precio) {
        super(_id, _nombre, _precio);
        this._provincia = _provincia;
    }
    
    public float GetterPrecio(){
    
        return super.GetterPrecio();
    
    }
   
    public void MostrarProducto(){
    
        super.MostrarProducto();
        
        StringBuilder St = new StringBuilder();
        St.append("Provincia : " +_provincia);

    
    }
    
}
