package ejemploobjetoscompraventa;

public class ArticuloLiquido extends articulo{
      private int _litros;
    public ArticuloLiquido(int codigo,String nombre, float precioCosto,int stock,int litros )
    {
        super(codigo,nombre,precioCosto,stock );
        this._litros= litros;
        
    }
}
