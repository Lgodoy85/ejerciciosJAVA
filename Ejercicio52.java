/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg52;

/**
 *
 * @author pc
 */
public class Ejercicio52 {

    /**
    Informar todos los números perfectos hasta el millón.
     */
    public static void main(String[] args) {
 
        int contador=1;
        int contador1=0;
        int suma=0;
        int numero=2;
        
        while(contador1<1000000)
        {
            while(contador<numero-1)
            {   
                 

                 if(numero%contador==0)
                 {  //si es divisor se suma
                     suma=suma+contador;
                 }
                 contador++;
     
            }
            contador=1;
            contador1++;
            if(numero==suma)
                 {
                     System.out.println("el numero: "+numero+" es perfecto");
                 }
            suma=0;
            numero++;
        }
    }
    
}