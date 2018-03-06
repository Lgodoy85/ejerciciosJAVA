package usodelwhilevalidar;

import java.util.Scanner;

public class UsoDelWhileValidar {
public static void main(String[] args) {

    //creamos las variables e importamos el scanner
    Scanner Misca = new Scanner (System.in);
    
    Integer edad; //Mayor a 0 y menos a 100
    Integer sueldo; //mayor a 0
    String sexo; //f o m
    String tipoAlumno; // C: Cursante - E: Egresado - L:Libre
    Integer temperatura; //-200 y +200
    String respuesta; //si o no
    
    System.out.println(" Ingrese sueldo : ");
    sueldo=Misca.nextInt();
    
    while (sueldo>0){
    
        System.out.println(" Error, reingrese sueldo : ");
        sueldo=Misca.nextInt();
    
    }
    
       System.out.println(" Ingrese edad : ");
       edad=Misca.nextInt();
       
    while (edad<1 || edad>100 ){
    
        System.out.println(" Error, reingrese la edad : ");
        edad=Misca.nextInt();
          
    }
    
       System.out.println(" Ingrese la temperatura : ");
       temperatura = Misca.nextInt();
       
    while (temperatura<-200 || temperatura>200){
    
        System.out.println(" Error, reingrese la temperatura : ");
        temperatura=Misca.nextInt();
    
    }
    
    System.out.println(" Ingrese su sexo : ");
    sexo=Misca.next();
    
    while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
    
        System.out.println(" Error, reingrese su sexo : ");
        sexo = Misca.next();
        sexo=sexo.toLowerCase();
       
    }
    
     System.out.println("Ingrese si es Cursante[C], libre [L] o egresado [E]");
        tipoAlumno=Misca.next();
        
        while(!tipoAlumno.equalsIgnoreCase("c") && !tipoAlumno.equalsIgnoreCase("l") && !tipoAlumno.equalsIgnoreCase("e"))
        {
            System.out.println("Error, re Ingrese si es Cursante[C], libre [L] o egresado [E]");
            tipoAlumno=Misca.next();
        
        }
        
        System.out.println("Ingrese respuesta");
        respuesta=Misca.next();
        
        while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"))
        {
            System.out.println("Error, re Ingrese respuesta");
            respuesta=Misca.next();
        }
    }
}
    
    
   

