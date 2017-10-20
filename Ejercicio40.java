/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg40;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio40 {
//Pedir 10 números e informar cuantos negativos, positivos y ceros ingresaron.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos las variables e importames el scanner
Scanner Misca = new Scanner (System.in);
String dato;
int numeros;
int positivos = 0;
int negativos = 0;
int contador = 0;
int ceros = 0;

while (contador < 10)
{ contador++;
    System.out.println(" Ingrese 10 numeros : " + contador);
    dato = Misca.next();
    numeros = Integer.parseInt(dato);
    
 //si es par va a entrar al if
 if (numeros == 0) {
     ceros++;
 }
 else
 { 
 if  (numeros > 0)
            {
     positivos++;
          }
 else
 {
     negativos++;
 
 }
 }
}
 
     System.out.println(" Lc cantidad de ceros ingresados son : " +ceros+ 
             " la cantidad de n°positivos ingresados son : " +positivos +  
             " la cantidad de n° negativos ingresados son :" +negativos);
}
}


    

