package ejemploherencia;

import java.util.Date;

public class Remito extends Documento {
    
private Date _fechaEnt;
    
    public Remito (int numero){

    super(numero);

}
    
    public void MostrarDatosCompletos (){

    System.out.println(" Numero de iva  "+this._fechaEnt);
    
}
    
}
