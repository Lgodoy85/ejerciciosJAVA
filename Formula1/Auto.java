/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula.pkg1;

/**

 */
public class Auto {
    
    private int numero;
    private Escuderia Miescuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido; 
    
    
    
    public void Mostrar(){
    
        System.out.println(" Numero " +this.numero);
        System.out.println(" Escuderia " +this.Miescuderia.nombre);
        System.out.println(" Model " +this.modelo);
        System.out.println(" Tiempo Recorrido " +this.TiempoRecorrido);
        System.out.println(" El ganador es " +this.elPiloto.DameNombreCompletoMay());        
        
    
    }
    
    public int DameElTiempoRecorrido (){
    
        return this.TiempoRecorrido;
    
    }
    
    public void AgregarTiempoRecorrido (int tiempo){
    
        this.TiempoRecorrido = this.TiempoRecorrido+tiempo;
    
    }
   
    
    public Auto(int numero){
    
        this.elPiloto = new Piloto();
        
        
        this.modelo = "For";
        this.numero = numero;
        this.Miescuderia = new Escuderia(1930, "Italia", "Ferrari");
        
        this.CargarPilotoRandom();
   }
    private void CargarPilotoRandom(){
    
       this.NombreRandom();
       this.ApellidoRandom();
       
    }
    
    private void NombreRandom (){
    
    int miRandom =(int) (Math.random()*10); 
    switch (miRandom){
        
        case 0:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
        case 1:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 2:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 3:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 4:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 5:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 6:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 7:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 8:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 9:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
         case 10:
            this.elPiloto.SetterNommbre("Rogelio");
            break;
            
        
    }}
    
    
    private void ApellidoRandom (){
    
    int miRandom =(int) (Math.random()*10);
    

    switch (miRandom){
        
        case 0:
            this.elPiloto.SetterApellido("Gimenez");
            break;
        case 1:
            this.elPiloto.SetterApellido("Rodriguez");
            break;
         case 2:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 3:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 4:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 5:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 6:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 7:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 8:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 9:
            this.elPiloto.SetterApellido("Rogelio");
            break;
         case 10:
            this.elPiloto.SetterApellido("Rogelio");
            break;
    
}}}
