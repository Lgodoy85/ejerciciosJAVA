/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg49;

/**
 *
 * @author pc
 */
public class Ejercicio49 {

    /**
    50- Informar todos los centro numéricos hasta el millón.
     */
    public static void main(String[] args) {
 
        {  //la variable numero es la cantidad de veces que hay que repetir todo. : del 1 al 1000.
         for (int numero = 6; numero < 1000000; numero++) {
             
         
            
            int sumaAnteriores=0;
            int sumaPosteriores=0;
            boolean EsCentroNumero=false;

            for (int contador = 1; contador < numero; contador++) {
                sumaAnteriores=sumaAnteriores+contador;//suma los numeros anteriores del numero

            }//fin del for 2
            //System.out.println(sumaAnteriores);

            for (int posterior = numero+1; ; posterior++) {
        //suma los numeros posteriores al numero y despues verifica, si la suma d elos anteriores y posteriores es lo mismo es centro numerico, si no, no.
                sumaPosteriores=sumaPosteriores+posterior;

                if(sumaAnteriores==sumaPosteriores)
                {  
                   EsCentroNumero=true;
                   break;
                }
                if (sumaPosteriores>sumaAnteriores)
                {
                    break;
                }
            }//fin del for 3

            if (EsCentroNumero)
            {
                System.out.println("Es centro numerico: "+numero);
            }
         }//fin del for 1   
     }
    }}
