package herencia;

class Empleado extends Persona {


    protected ePuesto puesto;
    protected double sueldo;

    public Empleado(ePuesto puesto, double sueldo, String nombre, int edad) {
        
        super(nombre, edad);
        
        this.puesto = puesto;
        this.sueldo = sueldo;

    }
    
    public String MostrarDatos(){
    
     StringBuilder sb = new StringBuilder();
     
     sb.append(super.MostrarDatos());     
     sb.append("puesto :" +this.puesto+"\n");
     sb.append("sueldo :" +this.sueldo+"\n");           
     
     return sb.toString();
    }
    
    }

