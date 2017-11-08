/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclasesyobjetos;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EjemplosClasesYobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1era parte
//        //para invocar estatico
//        int edad=33;
//        Calculadora.mostrarEstatico(edad);
//        
//        //para invocar de instancia
//        Calculadora miCal=new Calculadora();
//        miCal.mostrarInstancia();
//        
        //tipo de dato(Alumno), despues el nombre de la variable(nuevoAlumno).
//        int numero;
//        String dato;
//          Alumno nuevoAlumno;
//          nuevoAlumno=new Alumno();
//        
//        Usuario nuevoUsuario;
//        nuevoUsuario=new Usuario();
//        
//        nuevoUsuario.nombre="natalia natalia";
//        nuevoUsuario.clave="1234";
//        
//        nuevoUsuario.mostrarDatos();


//          Alumno nuevoAlumno1;
//          nuevoAlumno1=new Alumno();
//          Alumno nuevoAlumno2;
//          nuevoAlumno2=new Alumno();
//          Alumno nuevoAlumno3;
//          nuevoAlumno3=new Alumno();
//          Alumno nuevoAlumno4;
//          nuevoAlumno4=new Alumno();
//          Alumno nuevoAlumno5;
//          nuevoAlumno5=new Alumno();
//          Alumno nuevoAlumno6;
//          nuevoAlumno6=new Alumno();
//          Alumno nuevoAlumno7;
//          nuevoAlumno7=new Alumno();
//          Alumno nuevoAlumno8;
//          nuevoAlumno8=new Alumno();
//          Alumno nuevoAlumno9;
//          nuevoAlumno9=new Alumno();
//          Alumno nuevoAlumno10;
//          nuevoAlumno10=new Alumno();
//        //array de 10
//        Alumno []nuevoAlumno;
//        nuevoAlumno=new Alumno[10];
//        
//        //crea 10 objetos de Alumno.
//        for (int i = 0; i < 10; i++) {
//            nuevoAlumno[i]=new Alumno();
//        }

//        Usuario nuevoUsuario;
//        nuevoUsuario=new Usuario();       
//        nuevoUsuario.DameNombre("natalia natalia");
//        nuevoUsuario.DameClave("666");
//        
//        
//        nuevoUsuario.mostrarDatos();
//        System.out.println("el nombre es: "+nuevoUsuario.GetNombre());
//        nuevoUsuario.mostrarDatos();

//array, static, geter, seter.
//
//        Scanner miscan=new Scanner(System.in);
//        Alumno[] nuevoAlumno;
//        nuevoAlumno=new Alumno[10];
//        for (int i = 0; i < 10; i++) {
//            nuevoAlumno[i]=new Alumno();
//            String nombre=generarRandom.DameUnNombre();
//            nuevoAlumno[i].nombre=nombre;
//            
//            int edad=generarRandom.DameUnaEdad();
//            nuevoAlumno[i].legajo=edad;
//            
//            
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            nuevoAlumno[i].mostrarDatos();
//        }
        
          
          
   Scanner miscan=new Scanner(System.in);
        String datoAux;
        Alumno []nuevoAlumno;
        nuevoAlumno=new Alumno[10];
         for (int i = 0; i < 1; i++) {
        nuevoAlumno[i]=new Alumno();
           
            
        
            
    
   
//    nuevoAlumno._apellido = "Urbina";
//    nuevoAlumno._correo = "sebaurbina@gmail.com";
//    nuevoAlumno._sexo = "masculino";
//    nuevoAlumno._fechaDeNacimiento = "14 de noviembre de 1982";
//    nuevoAlumno._localidad = "Avellaneda";
//    nuevoAlumno._direccion = "Alsina 122";
//    nuevoAlumno._legajo = 1234;
//    nuevoAlumno._dni = 29987309;
    
    nuevoAlumno.getNombre();
    System.out.println("El nombre es " + nuevoAlumno.GetNombre());
    
    nuevoAlumno.GetApellido();
    System.out.println("El apellido es " + nuevoAlumno.GetApellido());
    
    nuevoAlumno.GetCorreo();
    System.out.println("El correo es " + nuevoAlumno.GetCorreo());
    
    nuevoAlumno.GetSexo();
    System.out.println("El sexo es " + nuevoAlumno.GetSexo());
    
    nuevoAlumno.GetNacimiento();
    System.out.println("La fecha de nacimiento es " + nuevoAlumno.GetNacimiento());
    
    nuevoAlumno.GetLocalidad();
    System.out.println("La localidad es " + nuevoAlumno.GetLocalidad());
    
    nuevoAlumno.MostrarInstanciaAlumno();   
        
        
    }
    
}