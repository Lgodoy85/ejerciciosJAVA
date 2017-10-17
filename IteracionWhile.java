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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracion.pkgwhile.pkg2;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IteracionWhile2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Scanner Misc = new Scanner (System.in); 
Integer micontador = 0;

while (micontador<3)
{
    micontador=micontador+1;
    System.out.println(" Contando.. ");
    
}
        System.out.println(" Termine ");
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracion.pkgwhile.pkg3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class IteracionWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaracion de variables y uso de scanner
Scanner Misca = new Scanner (System.in);
Integer contador = 0;
String aux;
Integer edad;
Integer sumador = 0;
Integer promedio;

while (contador<3)
{ 
contador=contador+1;
System.out.println(" Ingrese su edad " +contador );
aux = Misca.next();
edad = Integer.parseInt(aux);
    
sumador = sumador + edad;
}
promedio = sumador/3;
System.out.println(" El promedio es :  " +promedio );
    
}
    
    
}



