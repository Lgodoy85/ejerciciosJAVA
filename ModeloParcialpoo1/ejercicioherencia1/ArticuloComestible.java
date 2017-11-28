package ejercicioherencia;
import java.util.Date;


public class  ArticuloComestible extends Articulo  {
 
    private Date _FechaVencimiento;

    public ArticuloComestible(Date _FechaVencimiento, int _codigo, String _nombre, float _PrecioCosto, int _Stock) {
        super(_codigo, _nombre, _PrecioCosto, _Stock);
        this._FechaVencimiento = _FechaVencimiento;
    }

  

  
    }
    
