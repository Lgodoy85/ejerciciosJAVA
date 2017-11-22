package ejemploherencia;

import java.util.Date;

public class Alumno extends Persona {
 
private Date _FechaInsc;
private int  _legajo;

   public void MostrarLosDatos(){
   
       super.MostrarLosDatos();
       System.out.println(" Fecha de Ingreso : "+this._FechaInsc);
       System.out.println(" Numero de legajo : "+this._legajo);
       
   
   }
}
