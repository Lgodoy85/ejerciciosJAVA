package AdministracionVeterinaria;

/*
Clase Mascota
-Nombre String
-Raza String
-EstaBañado boolean
-sexo string
+Constructor , que recibe por parámetros el nombre y la raza, EstaBañadp siempre se inicializa en false.	
+GetterNombre(): string
+bañar()cambia el estado de “EstaBañado” solo si está el false.
+ToString()
*/


public class Mascota {

    private String _nombre;
    private String _raza;
    private boolean estabañado;
    private String _sexo;
    
    public Mascota (String nombre , String raza, String sexo ){
        
        this._nombre=nombre;
        this._raza=raza;
        this._sexo=sexo;
        this.estabañado=false;
   
    }
    
    public String GetNombre (){
    
        return this._nombre;
    
    }
    
    public boolean bañar (){
    
        boolean retorno=false;

        if (this.estabañado==false){
        
            System.out.println(" Esta bañado ");
            return true;
        
        }    
        
        return retorno;
    
    }
    
    public String toString (){
    
        return "nombre : " + this._nombre + "raza : " +this._raza;
    
    }
    

    
}
