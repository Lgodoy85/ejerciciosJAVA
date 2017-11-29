package ejemploproductocontainer;

public class ProductosImportados extends Producto {
 
    private String _pais;
    private float _impuesto;

    public ProductosImportados(String _pais, int _id, String _nombre, float _precio, float impuesto) {
        super(_id, _nombre, _precio);
        this._pais = _pais;
        this._impuesto=impuesto;
        
    }
    public float GetterPrecio(){
    
        return this._precio + this._impuesto;
    
    }

    public void MostrarProducto(){
    
        super.MostrarProducto();
        
        StringBuilder St = new StringBuilder();
        St.append("Pais : " +_pais);
        St.append("Impuesto : "+this._impuesto);
    
    
    }
    public String toString (){
    
        return this._pais+this._impuesto;
    
    
    }
   
    
    
    
}
