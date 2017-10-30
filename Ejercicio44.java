/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg44;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio44 {
//Pedir un número e informar la suma de todos sus antecesores hasta el cero.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos las vatiables e importamos el scanner
Scanner Misca = new Scanner(System.in);
String dato;
Integer numero;
Integer suma = 0;

//mostramos el mensaje
System.out.println(" Ingrese un numero :  ");
dato = Misca.next();
numero = Integer.parseInt(dato);

//iteramos
while (numero!=0)
{ numero--;
  suma+=numero;
} //se muestra la suma de todos los antecesores
  System.out.println(" La suma de todos sus antecesores es : " +suma );
}
    }
    

