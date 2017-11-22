package ejemploherencia;

public class FacturaB extends Documento{

protected float _IIBB;

public FacturaB (int numero){

    super(numero);

}

public void MostrarDatosCompletos (){

    System.out.println(" Numero de iva  "+this._IIBB);
    
}


}
