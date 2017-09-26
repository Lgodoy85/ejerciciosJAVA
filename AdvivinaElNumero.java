/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advivina.el.numero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdvivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declaracion de variables
    Scanner Misc = new Scanner (System.in);
    String dato;
    Integer numero;
    //generador de numeros aleatorios
    Random generador = new Random();

    //genera un numero entre 1 y 10 y lo guarda en la variable numeroAleatorio
    int numeroaleatorio = 1+generador.nextInt(10);
    //imprimo el numero en consola
        System.out.println(" Numero secreto ");
    
    System.out.println(" Ingrese un numero ");
    dato = Misc.next();
    numero = Integer.parseInt(dato);
    
    if (numero==numeroaleatorio)
    {       System.out.println(" Es correcto ");
    } else 
    {
        if (numero>numeroaleatorio)    
        System.out.println(" Se paso ");
      else
            System.out.println(" Te falto ");
        
    }  
        
    }
    
}

//Integer miRandom = (int) (match.randmon()*10 )+1;