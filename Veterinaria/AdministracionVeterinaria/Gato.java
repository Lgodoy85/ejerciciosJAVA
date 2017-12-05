package AdministracionVeterinaria;

/**
Clase Gato 
Araña boolean
+Constructor que recibe todos los parámetros necesarios.
+ToString()
 */
public class Gato extends Mascota {
   
    private boolean _araña;

    public Gato(boolean _araña, String nombre, String raza, String sexo) {
        super(nombre, raza, sexo);
        this._araña = _araña;
    }
    
    public boolean GetAraña (){
    
        if (this._araña=true){
            
            return true;
        }
    
        return false;
    }
    
    public String toString (){
    
        return super.toString()+"araña : " +this._araña;
    
    }
    
    
    
}
