package AdministracionVeterinaria;
/*
Clase Perro
-Muerde boolean
-Tamaño ( chico, mediano, grande , gigante)
+Constructor que recibe todos los parámetros necesarios.
+ToString()
*/
public class Perro extends Mascota {
  
    private boolean _muerde;
    private Tamaño  _tamaño ;

    public Perro(boolean _muerde, Tamaño mtamaño,String nombre, String raza, String sexo) {
        super(nombre, raza, sexo);
        this._muerde = _muerde;
        this._tamaño = mtamaño;
    }

    
    public String toString(){
    
        return super.toString()+"tamaños : " +this._tamaño + "muerde : " +this._muerde ;
        
        
    
    }}
    
        
        
    
    
    
    

