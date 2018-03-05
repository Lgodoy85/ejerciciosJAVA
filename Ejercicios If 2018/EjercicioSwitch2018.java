package ejercicio.pkgswitch.pkg2018;

import java.util.Scanner;

    public class EjercicioSwitch2018 {

    /**
     * Switch con dias y edad con if
     * Se pie el ingreso de un dia de la semana y una edad, de ser dia 
     * del fin de semana y tener menos de 13 años , mostrar el mensaje 
     * " a descansar ". Si es dia de la semana y la misma edad, mostrar el mensaje " 
     * a estudiar". Si la edad supera los 18 años el mensaje es " a trabajar ". Si la edad
     * esta entre los 15 y los 30 " a festejar " solo si es fin de semana.
     */
    public static void main(String[] args) {
    //creamos las variables e importamos el scanner

     Scanner Misca = new Scanner(System.in);
     
     String dato;
     String dia;
     int edad;
     
        System.out.println(" Ingrese un dia de semana ");
        dia = Misca.next();
        
        System.out.println(" Ingrese la edad ");
        dato = Misca.next();
        edad = Integer.parseInt(dato);
       
        dia=dia.toLowerCase();
        switch (dia){
        
        case "sabado": case "domingo":
        if (edad<13){                
        System.out.println(" a descansar ");
        }
        else {
        
            if ((edad>15) && (edad<30)) {
                
                System.out.println(" a festejar ");
            }      
        
        }
        break;
            
        case "lunes": case "martes": 
        case "miercoles": case "jueves": case "viernes":
        if (edad==13){
        
        System.out.println(" a estudiar ");     
        }
        default:
            
        if (edad>18){
        
        System.out.println(" a trabajar "); 
        }
 
        }
        
    }
    
}
