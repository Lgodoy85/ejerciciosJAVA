/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg47;

import java.util.Scanner;

/**
 Informar todos los números primos del 1 al 1000.
 * 
 * @author pc
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos las variables e importamos el scanner
Integer numeroPrimo = 2;

//iteramos
while (numeroPrimo<100) {
    
    Integer contador = 2;
    Integer contadorDePrimo = 0;
    
while (contador<numeroPrimo) {
    
    if (numeroPrimo%contador==0){
        contadorDePrimo++;
        
    break;
    }
    contador++;
}
//creamos la bifurcacion
if (contadorDePrimo > 0 ) 
{ System.out.println(" no es primo "); 
} else 
        System.out.println(" es primo el numero :  " +numeroPrimo );

numeroPrimo++;
}}
}
