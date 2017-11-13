/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg48;

/**
 *
 * @author pc
 */
public class Ejercicio48 {

    /**
    Informar si un número es centro numérico
     */
    public static void main(String[] args) {
//Declaramos las variables e importamos el s{
//Declaramoscanner
        int sum1 = 0;
        int num = 1;
        int n;
        int contador = 1;

        //iteramos
	while( contador<=1)
	{
	int sum2 = 0;
	n=num;
	sum1=n*(n-1)/2;
		while(sum2<=sum1)
		 {n++;
		  sum2=sum2+n;
		 }
	 if(sum2==sum1)
	 {System.out.println("Es centro numerico/n");
	  contador++;
	 }
 
	  num++;
 
	}
 
}}