/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg38;

/**
 *
 * @author pc
 */
public class Ejercicio38 {
//Mostrar la suma de los primeros 100 números naturales.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int suma = 0;
 int contador = 0; 
 
 while (contador < 100) {
     contador++;
     suma +=contador;
     System.out.println(" La uma de los 100 n° naturales son : " +contador);
    }
    }  
}
