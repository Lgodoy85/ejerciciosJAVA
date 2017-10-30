/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg46;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio46 {

    /**
    Informar si un número es primo o no.
     */
    public static void main(String[] args) {
//Declaramos las variables e importamos el scanner
 Scanner miscan=new Scanner(System.in);
       String datoAux;
       Integer numero;
       Integer contador=2;
       Integer contadorDeDiv=0;
       
       System.out.println("Ingrese numero");
       datoAux=miscan.next();
       numero=Integer.parseInt(datoAux);
       
       while(contador<numero)
       {
           
           
           if (numero%contador==0)
           {
               contadorDeDiv++;
               break;
           }
          contador++;
       }//fin del while
       
        if(contadorDeDiv>0)
            {
                System.out.println("No es primo");
            }else
            {
                System.out.println("Es primo el numero: "+numero);
            }
       
    }
    
}