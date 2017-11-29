package ejemploproductocontainer;

public class Producto {
    
    private int _id;
    private String _nombre;
    public float _precio;

    public Producto(int _id, String _nombre, float _precio) {
        this._id = _id;
        this._nombre = _nombre;
        this._precio = _precio;
    }
    
    public float GetterPrecio(){
    
        return this._precio;
    
    }
    
    public void MostrarProducto(){
    
        StringBuilder st = new StringBuilder();
        st.append("id : " +this._id);
        st.append("nombre : "+this._nombre);

    
    }
    public String toString (){
    
        return this._id+this._nombre;
    
    
    }
    
}
