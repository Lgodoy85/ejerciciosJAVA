/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula.pkg1;

/**
 *
 * @author pc
 */
public class Auto {
    
    private int numero;
    private Escuderia Miescuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido; 
    
    
    
    
    private void añoRandom (){
    
        int MiRandom = (int) (Math.random()*1900);
        this.Miescuderia.SetterAño(MiRandom);
    
    }
    
    private void EscuderiaRandom(){
    
        int MiRandom = (int) (Math.random()*6);
        switch (MiRandom){
        
            case 0:
                this.Miescuderia.SetterNombre("Ferrari");
                break;
            case 1:
                this.Miescuderia.SetterNombre("Lamborghini");
                break;
            case 2:
                this.Miescuderia.SetterNombre("McLaren");
                break;
                
                case 3:
                this.Miescuderia.SetterNombre("Porsche");
                break;
                
                case 4:
                this.Miescuderia.SetterNombre("Mercedes Benz");
                break;
                
                case 5:
                this.Miescuderia.SetterNombre("Williams");
                break;
        }
      
        }
        
         
    
    private void PaisRandom(){
        
        int MiRandom = (int) (Math.random()*6);
        
        switch (MiRandom){
        
            case 0:
                this.Miescuderia.Setterpais("Argentina");
                break;
                case 1:
                this.Miescuderia.Setterpais("Brasil");
                break;
                
                case 2:
                this.Miescuderia.Setterpais("Alemania");
                break;
                
                case 3:
                this.Miescuderia.Setterpais("Italia");
                break;
                
                case 4:
                this.Miescuderia.Setterpais("Francia");
                break;
                
                case 5:
                this.Miescuderia.Setterpais("España");
                break;
        } 
        
    }
        
    
    public void CargarEscuderia(){
    
        this.EscuderiaRandom();
        this.añoRandom();
        this.PaisRandom();
        
    
    
    } 
    
    public void Mostrar(){
    
        System.out.println(" Numero " +this.numero);
        System.out.println(" Escuderia " +this.Miescuderia.NombreEscuderiaPais());
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
        //this.Miescuderia = new Escuderia(1930, "Italia", "Ferrari");
        this.Miescuderia = new Escuderia();
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
            this.elPiloto.SetterNommbre(" Claudio ");
            break;
        case 1:
            this.elPiloto.SetterNommbre(" Horacio ");
            break;
         case 2:
            this.elPiloto.SetterNommbre(" Martin ");
            break;
         case 3:
            this.elPiloto.SetterNommbre(" Enrique ");
            break;
         case 4:
            this.elPiloto.SetterNommbre(" Raul ");
            break;
         case 5:
            this.elPiloto.SetterNommbre(" Pedro ");
            break;
         case 6:
            this.elPiloto.SetterNommbre(" Esteban ");
            break;
         case 7:
            this.elPiloto.SetterNommbre(" Ruben ");
            break;
         case 8:
            this.elPiloto.SetterNommbre(" Dario ");
            break;
         case 9:
            this.elPiloto.SetterNommbre(" Ramon ");
            break;
         case 10:
            this.elPiloto.SetterNommbre(" Rogelio ");
            break;
            
        
    }}
    
    
    private void ApellidoRandom (){
    
    int miRandom =(int) (Math.random()*10);
    

    switch (miRandom){
        
        case 0:
            this.elPiloto.SetterApellido(" Gimenez ");
            break;
        case 1:
            this.elPiloto.SetterApellido(" Rodriguez ");
            break;
         case 2:
            this.elPiloto.SetterApellido(" Peres ");
            break;
         case 3:
            this.elPiloto.SetterApellido(" Gonzales ");
            break;
         case 4:
            this.elPiloto.SetterApellido(" Martinez ");
            break;
         case 5:
            this.elPiloto.SetterApellido(" Ledesma ");
            break;
         case 6:
            this.elPiloto.SetterApellido(" Godoy ");
            break;
         case 7:
            this.elPiloto.SetterApellido(" Acosta ");
            break;
         case 8:
            this.elPiloto.SetterApellido(" Messi ");
            break;
         case 9:
            this.elPiloto.SetterApellido(" Ronaldo ");
            break;
         case 10:
            this.elPiloto.SetterApellido(" Suarez ");
            break;
    
}}}
