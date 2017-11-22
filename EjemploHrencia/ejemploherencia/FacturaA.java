package ejemploherencia;

public class FacturaA extends Documento {
    
private float iva; 

public FacturaA (int numero){

    super(numero);

}

    public void SetterNumero (int numero){
    
        this._numero=numero;
    
    }
    
    public void MostrarDatosCompletos (){

        System.out.println(" Numero de iva  "+this.iva);
    
}
 
    
}
