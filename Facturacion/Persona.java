package ejemplo.facturacion;

public class Persona {
  
    private String _nombre;
    private String _apellido;
    public Persona(String nom, String ape){
    
        this._apellido= ape;
        this._nombre=nom;
        
    }
    
    public static Persona RetornarPersonaRandom (){
    
        Persona retorno = new Persona ("Natalia","Natalia");
        
        
        
        return retorno;
    
    }
    
    public void MostrarPersona (){
    
        System.out.println(" Nombre : " + this._nombre+ "Apellido :" + this._apellido);
    
    }
    public void MostrarCliente(){
    
        System.out.println(" Nombre : " + this._nombre+ "Apellido :" + this._apellido);
    
    }
    
}
