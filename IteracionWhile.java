/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracion.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaracion de variables y Asignacion de Scanner
Scanner Misc = new Scanner (System.in);

String clave;
System.out.println(" Ingrese clave ");
clave = "1234";Misc.next();
//para validacion siempre.

while(!clave.equals("1234"))
{
            System.out.println("error Reingrese clave");
            clave=Misc.next();
        }
        
        System.out.println("bienvenido");
        
                
        
    
}   
    
    
}
