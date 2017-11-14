/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosestaticos;

/**
 Crear una clase llamada Calculadora que posea tres métodos estáticos (de clase):
a. Calcular (público): Recibirá tres parámetros, el primer número, el segundo número
y la operación matemática. El método devolverá el resultado de la operación.
b. Validar (Privado): Recibirá como parámetro el segundo número. Este método se
debe utilizar sólo cuando la operación elegida sea la DIVISION. Este método
devolverá TRUE si el número es distinto de CERO.
c. Mostrar (público): Este método recibe como parámetro el resultado de la
operación y lo muestra por pantalla. No posee valor de retorno.
  */
    
public class Calculadora {
 
    //A
public static double Calcular ( int numero, int numero1, String operacion ){

    double resultado=0;
    
    switch (operacion){
    
        case "+":
            resultado=numero+numero1;
            return resultado;
        
        case "-":
            resultado=numero-numero1;
            return resultado;
         
        case "*":
            resultado=numero*numero1;
            return resultado;
            
        case "/":
            System.out.println(Calculadora.validar(numero1));
            resultado=numero/numero1;
            return resultado;
            
        default:
            return resultado;
        
    
    
    }
    
    
}

//B
private static boolean validar (int numero){

    boolean validacion = true;
    
    if (numero%2==0){
        return validacion = false;
    } else
    {
        
        return validacion = true;
    }}




public static void MostrarOperacion (double resultado){

    System.out.println(" El resultado de la operacion es : " + resultado);
    

}





    
}


