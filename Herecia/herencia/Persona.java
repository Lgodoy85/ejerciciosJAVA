package herencia;

public class Persona {

protected String nombre;
protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String MostrarDatos(){
    
     StringBuilder sb = new StringBuilder();
     
     sb.append(" Nombre :" +this.nombre+"\n");
     sb.append(" Edad : " +this.edad+"\n");           
     
     return sb.toString();
    
    }
    
    
    
    
}
