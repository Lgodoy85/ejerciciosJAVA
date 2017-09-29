/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg30.pkgif;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio30If { 
//Se ingresa un mes del año y si es Enero: "que comiences bien el año!” "
//"si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” , "
//"si es Diciembre: "Felices fiesta!”.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaracion de variables
String mes;
Scanner Misc = new Scanner (System.in);

System.out.println(" Ingrese mes del año ");
mes = Misc.next();
    
if (mes.equals("enero"))    
{ System.out.println(" Que comiences bien el año! ");
} if (mes.equals("Marzo"))
{ System.out.println(" a clases! ");
} if (mes.equals("julio"))
{ System.out.println(" Se vienen las vacaciones! ");
} if (mes.equals("diciembre"))
{ System.out.println(" Felices Fiestas! ");

    
        
    

    
}
    }
    
}
