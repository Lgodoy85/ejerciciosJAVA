package ejemploherencia;

import java.util.Date;

public class AlumnoEgresado extends Alumno{
 
   private Date _FechaEgreso;
   private float _Promedio;
   
   public void MostrarLosDatos(){
   
     super.MostrarLosDatos();
       System.out.println(" FechaEgreso es : " +this._FechaEgreso);
       System.out.println(" El promedio es : "+this._Promedio);
       
   
   }
    
    
    
}
