package cine;

public class Butacas {
 
    private int _numeroButacas;
    private int _PrecioButacas;
    private boolean _disponibilidad;

     public Butacas()
    {
        this._numeroButacas=1;
        this._disponibilidad=true;
        this._PrecioButacas=75;
    }
    
    public void SetButaca(int numero)
    {
        this._numeroButacas=numero;             ;
    }           
    
    public void SetDispo(boolean entrada)
    {
        this._disponibilidad=entrada;
    }
    
    
    public void MostrarButaca()
    {
        System.out.println("Butaca numero: "+this._numeroButacas);
        System.out.println("Disponibilidad: "+ this._disponibilidad);
        System.out.println("El precio: "+this._PrecioButacas);
        
    }
    
    
}
