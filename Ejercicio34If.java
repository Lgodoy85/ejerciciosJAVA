/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg34.pkgif;
//34-Se pide un día de la semana, si es lunes mostrar el mensaje  “Buen comienzo”,
//para el resto de los días hábiles mostrar” a aguantar “ si es sábado o domingo mostra buen finde

import java.util.Scanner;

//mostrar “ Buen fin de”.
/**
 *
 * @author pc
 */
public class Ejercicio34If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Declaracion de variables y Scanner
 String dia;
 Scanner Misc = new Scanner (System.in);
 
 //mostramos el mensaje y luego parseamos
 System.out.println(" Ingrese el dia ");
 dia = Misc.next();
 
 //hacemos el switch 
 switch (dia)
 {
     case "lunes":
         System.out.println(" Buen comienzo " );
         break;
         
     case "sabado":
     case "domingo":
         System.out.println("Buen finde");
         break;
         
     case "martes":
     case "miercoles":
     case "jueves":
     case "viernes":
         System.out.println(" a aguantar ");
         break;
         
 } 
    }
    
}
