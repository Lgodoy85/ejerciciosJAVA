/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg45;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaramos variables e importamos y creamos scanner
        Scanner Misca= new Scanner(System.in);
        String dato;
        Integer personas;
        Integer edad;
        Integer niños=0;
        Integer adolecentes=0;
        Integer adultos=0;
        Integer promedio;
        Integer contador=0;
        Integer contadorDeEdad=0;
        
        
        //mostramos mensaje y pedimos datos
        System.out.println("Ingrese cantidad del grupo: ");
        dato=Misca.next();
        personas=Integer.parseInt(dato);
        //iteramos mientras contador sea menor al numero de personas ingresadas
        while(contador<personas)
        {   //aumentamos el contador de a 1
            contador++;
            //pedimos datos
            System.out.println("Ingrese la edad de la persona numero: "+personas);
            dato=Misca.next();
            edad=Integer.parseInt(dato);
            //sumamos las edades 
            contadorDeEdad+=edad;
            
            //si es mayor a 17 entra aca
            if (edad>17)
            {   //se suma los adultos si es mayor a 17
                adultos++;
            }else
            {
            //son menores a 18
                if(edad<13)
                {   //se suman los niños
                    niños++;
                }else
                {   //aca entre 13 y 17
                    adolecentes++;
                }
        
            }
            
        }
        //hacemos el promedio de edad
        promedio=contadorDeEdad/personas;
        //mostramos la cantidad de adultos, niños y adolecentes y el promedio.
        System.out.println("La cantidad de adultos es: "+adultos+" la cantidad "
        + "de adolecentes: "+adolecentes+" la cantidad de niños: "+niños+ 
        " el promedio de edad: " + promedio);
    }}