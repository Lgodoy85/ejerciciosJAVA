package ejercicioherencia;
public class ArticuloLiquido extends Articulo  {
  
    private double _litros;

    public ArticuloLiquido(double _litros, int _codigo, String _nombre, float _PrecioCosto, int _Stock) {
        super(_codigo, _nombre, _PrecioCosto, _Stock);
        this._litros = _litros;
    }

   
}    