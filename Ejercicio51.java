/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg51;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio51 {

    /**
    Informar si un número es número perfecto.
     */
    public static void main(String[] args) {
        Scanner Misca = new Scanner (System.in);
        String aux;
        int numero = 6;
        int suma = 0;
        
        System.out.println( " Ingrese un numero ");
        aux = Misca.next();
        numero = Integer.parseInt(aux);
        
        for (int i = 0; i < numero; i++) {
            
            if (numero%1==0)
                suma+=i;
        }
        if (suma==numero){
            System.out.println(" El numero : " + numero + " es un numero perfecto ");
        } else
        { System.out.println(" El numero : " + numero + " no es un numero perfetco");
            
        }
    }
    
}
