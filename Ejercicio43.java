/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg43;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio43 {
// Se piden los nombres de los alumnos, informar cuantas marías y cuantos
// José hay en el curso,además de cuantos alumnos hay.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos la variable y mostramos el mensaje
   Scanner Misca = new Scanner (System.in);
   String dato;
   String alumnos;
   Integer Maria = 0;
   Integer Jose = 0;
   Integer alu = 0;
   Integer Contador = 0;
   String continuar = "si";



   //iteramos
   while (!continuar.equalsIgnoreCase("no"))
   {
    Contador++;
    System.out.println(" Ingrese los nombres de los alumnos : " +Contador);
    alumnos = Misca.next();
    alu++;
    //creamos la bifurcacion
    if (alumnos.equals("jose")){
    Jose++;
    } else
    if (alumnos.equals("maria")){
    Maria++;
                    
}
       System.out.println(" Desea continuar ?  ");
       continuar = Misca.next();
    }
        System.out.println(" La cantidad de Marias que hay en el curso son : " 
        + Maria + " La cantidad de Jose que hay en el curso son : " + Jose + " La cantidad total "
        + " de alumnos son " + alu );
    }
    
}
