/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22.pkgif;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio22If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declaramos variables e importamos y creamos el scanner.
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        Integer nota;
        
        //pedimos datos.
        System.out.println("ingrese nota");
        datoAux=miscan.next();
        //parseamos
        nota=Integer.parseInt(datoAux);
        
        if (nota == 10)
        {   //los de 10
            System.out.println("Excelente");
            
        }else
        {
            if(nota >3)
            {   //los de 4 a 9
                System.out.println("aprobo");
                
            }else
            {
                System.out.println("la proxima sera");
            }
        }
    }
}
    
    

