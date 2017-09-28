/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Adivinaelnumero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaracion de variables
//Creamos la bifurcacion
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

dato=Misc.next();
resultado=Integer.parseInt(dato);

if (numero==numerosecreto)
{ System.out.println(" acertaste ");
} else
{ resultado=numero-numerosecreto;
//si la resta dio numero negativo entra al if e invierte la resta
if(resultado<0)
{ System.out.println(" te falto ");
}  else 
{ resultado=numero-numerosecreto;
{ System.out.println(" te pasaste ");
}
}
switch (resultado)
{           case 1:
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
}   
