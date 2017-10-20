/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg39;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio39 {
//Pedir 10 números e informar cuantos pares ingresaron.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //declaramos variables e importamos y creamos el scanner
        Scanner misca = new Scanner(System.in);
        String datoAux;
        Integer numeros;
        int contador=0;
        int pares=0;
        
        //creamos la iteracion
        while(contador<10)
        {   //aumentamos el contador
            contador++;
            //mostramos mensaje y pedimos datos
            System.out.println("Ingrese numero: "+contador);
            datoAux=misca.next();
            numeros=Integer.parseInt(datoAux);
            //si es par va a entrar al if
            if (numeros%2==0)
            {   //cuenta los pares
                pares++;
            }
        }
        //mostramos mensaje
        System.out.println("Ingreso: "+pares+" pares");
    }
    
}


