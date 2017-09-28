/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Adivinaelnumero {
 /**
     * informar si : 
     * a: si le erro por 1 punto mensaje "Casi casi"
     * b:si le erro por 2 puntos mensaje "Cerca"
     * c:si le erro por 3 puntos mensaje "ni cerca"
     * d: si le erro por 4 puntos "bien lejos"
     * f:para todos los demas "sos horrible en este juego ".
     * 
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaracion de variables
Scanner Misc = new Scanner (System.in);
String dato;
Integer numero;
Integer resultado;
//generador de numeros aleatorios
Random generador = new Random();
int numerosecreto=1+generador .nextInt(10);
//mostramos el mensaje

System.out.println(" El numero secreto es : " +numerosecreto); 
System.out.println(" Ingrese un numero entre 1 y el 10 ");
dato = Misc.next();
numero = Integer.parseInt(dato);

if (numero==numerosecreto)
{            System.out.println(" acertaste ");
} if (numero>numerosecreto)
{            System.out.println(" se paso ");
} else 
{System.out.println(" te falto ");
    }
resultado = numero-numerosecreto;
//variable=el math.abs(variable) sirve para devolver el valor absoluto. 
//Ej. si el resultado es -1 te devuelve 1.
resultado = Math.abs(resultado);

switch (resultado)
 {
//si quedo a 1 numero de adivinar
// se puede poner case -1: para no usar el resultado=Math.abs(resultado);
               case 1:
                System.out.println("Casi Casi");
                break;
            //si queda a 2 numeros de adivinar
            case 2:
                System.out.println("Cerca");
                break;
                //si queda a 3 numeros de adivinar
            case 3:
                System.out.println("Ni cerca");
                break;
            //si queda a 4 numeros de adivinar
            case 4:
                System.out.println("Bien lejos");
                break;
            default :
                System.out.println(" sos horrible en este juego ");
                break;
                    

 }



    
    }
    
}
