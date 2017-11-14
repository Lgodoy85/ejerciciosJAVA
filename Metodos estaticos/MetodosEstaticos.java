/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticos;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MetodosEstaticos {

    /**
     * 4- Realizar un programa(utiliando los métodos de la clase Validación )que pida números
            entre -100 y 100 hasta que el usuario lo desee, de los números ingresados se debe
            informar:
            a. El promedio.
            b. La suma.
            c. La cantidad de números ingresados.
            d. El mayor número ingresado.
            e. El menor número ingresado.
            f. La cantidad de números pares
         */
        
     
    public static void main(String[] args) {
        
   
        //ejercicio 1
        //System.out.println(Validacion.validar(10, 50, 60));
        
        //ejercicio 2
        //System.out.println(Validacion.ValidaS_N("SI"));
        
        //ejercico 3
        //System.out.println(Validacion.Es_PAR(11));
        
        
        Scanner miscan=new Scanner(System.in);
//        String aux;
//        int superior=100;
//        int inferior=-100;
//        int numero;
//        int contador=0;
//        float promedio=0;
//        int suma=0;
//        int mayor=0;
//        int menor=1000;
//        int pares=0;
//      
//        
//            System.out.println("Ingrese numeros entre el -100 y el 100");
//            aux=miscan.next();
//            numero=Integer.parseInt(aux);
//            
//            
//        while (Validacion.validar(inferior, superior, numero))
//        {   contador++;
//            suma=suma+numero;
//            
//            if(Validacion.Es_PAR(numero))
//            {
//                pares++;
//            }
//            
//            if(numero>mayor)
//            {
//                mayor=numero;
//            }else
//            {
//                if(numero<menor)
//                {
//                    menor=numero;
//                }
//            }
//            System.out.println("¿quiere ingresar otro numero?");
//            aux=miscan.next();
//            if(Validacion.ValidaS_N(aux))
//            {
//                System.out.println("Ingrese numeros entre el -100 y el 100");
//                aux=miscan.next();
//                numero=Integer.parseInt(aux);
//                
//            }else
//            {
//                break;
//            }
//
//        }
//        
//        promedio=suma/contador;
//        
//        System.out.println("El promedio es: "+promedio);
//        System.out.println("La suma de los numeros: "+suma);
//        System.out.println("La cantidad de numeroes ingresado: "+contador);
//        System.out.println("El numero mayor ingresado es: "+mayor);
//        System.out.println("El menor : "+menor);
//        System.out.println("La cantidad de numeros pares es: "+pares);

        //Ejercicio 5
//        System.out.println(" Area del cuadrado : " + CalculoDeArea.CalcularCuadrado(20));
//        
//        System.out.println(" Area del Triangulo : " + CalculoDeArea.CalcularTriangulo(5, 3));
//        
//        System.out.println(" Area del Circulo : " +CalculoDeArea.CalcularCirculo(8));
//

        /**
         * 6- Realizar un programa que permita realizar operaciones matemáticas simples (suma, resta,
        multiplicación y división). Para ello se le debe pedir al usuario que ingrese dos números y
        la operación que desea realizar (pulsando el caracter +, -, * ó /).
        El usuario decidirá cuándo finalizar el programa.
        Crear una clase llamada Calculadora que posea tres métodos estáticos (de clase):
        a. Calcular (público): Recibirá tres parámetros, el primer número, el segundo número
        y la operación matemática. El método devolverá el resultado de la operación.
        b. Validar (Privado): Recibirá como parámetro el segundo número. Este método se
        debe utilizar sólo cuando la operación elegida sea la DIVISION. Este método
        devolverá TRUE si el número es distinto de CERO.
        c. Mostrar (público): Este método recibe como parámetro el resultado de la
        operación y lo muestra por pantalla. No posee valor de retorno.
         */
     
        Scanner Misca = new Scanner (System.in);
        
        String dato;
        int numero;
        int numero1;
        String operador;
        String validar;
        boolean validacion = true;
        
        //mostramos el mensaje
        System.out.println(" Ingrese un numero ");
        dato = Misca.next();
        numero = Integer.parseInt(dato);
        
        System.out.println(" Ingrese el sig numero ");
        dato = Misca.next();
        numero1 = Integer.parseInt(dato);
        
        System.out.println(" Ingrese el operador ");
        operador = Misca.next();
        
        System.out.println(Calculadora.Calcular(numero, numero1, operador));
        
        
        System.out.println(" Desea hacer otra operacion? [si/no] ");
        validar = Misca.next();
        
        if (validar.equalsIgnoreCase("no")){
         
            validacion = false;
            
        }
        
        
    }
        
        
        
    }
    }
