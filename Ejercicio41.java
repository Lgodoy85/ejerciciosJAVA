/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio41;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio41 {
//Pedir un número y mostrar todos sus antecesores hasta el cero.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos las variables y importames el scanner
Scanner Misca = new Scanner (System.in);
String dato;
Integer numero;
Integer contador=0;

//mostramos el mensaje y luego perseamos
System.out.println(" Ingrese un numero ");
dato = Misca.next();
numero = Integer.parseInt(dato);

while(numero!=0)
{
numero--;
System.out.println(" El antecesor es : " +numero);
}
    }   
}
