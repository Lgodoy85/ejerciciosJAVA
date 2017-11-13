/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg53;

/**
 *
 * @author pc
 */
public class Ejercicio53 {

    /**
    mostrar la Sucesión de Fibonacci hasta el 100
     */
    public static void main(String[] args) {
 
        int contador=0;
        int max=100;
        int fibo1,fibo2;
        
        //iniciamos las variables
        fibo1=1;
        fibo2=2;
        //mostramos el fibo 1 
        System.out.println(fibo1+ "");
        //itereamos
        while (contador+1<max){
            contador++;
            
            System.out.println(fibo2+ "");
            fibo2+=fibo1;
            fibo1+=fibo2;
            
            if (fibo2>100){
                break;
            }
            
        }
    }
    
}
