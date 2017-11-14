/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula.pkg1;

import java.time.Instant;

/**
 *
 * @author alumno
 */
public class Carrera {
    
    public Auto[] AutoParticipantes;
    private String fecha;
    private String pais;
   
    /**
     * 1_no tiene valor de retorno
     * 2_ Se llama igual que la clase
     * 3_Si por defecto, puede estar o no
     * 4_Se ejecuta solamente al crear el objeto.
     * 
     */


    public Auto DameElGanador (){
    
       Auto retorno = new Auto(0);
       int MenorRecorrido=0;
       
        for (int i = 0; i < this.AutoParticipantes.length; i++) {
            if (i==0)
                {
                    MenorRecorrido= this.AutoParticipantes[1].DameElTiempoRecorrido();
                    retorno= this.AutoParticipantes[i];
                } else
            {
                if  (MenorRecorrido > this.AutoParticipantes[i].DameElTiempoRecorrido());
            
                    MenorRecorrido=this.AutoParticipantes[i].DameElTiempoRecorrido();
                     retorno = this.AutoParticipantes[i];
                }   }
       
       return retorno;
        
            }
        
    
    
    
    
    public Carrera(){
         
        // fecha actual 
        this.fecha=Instant.now().toString();
        this.pais="Argentina";
        this.AutoParticipantes = new Auto[20];
        this.CrearAutosTest();

    }
    
    private void CrearAutosTest(){
    
        for (int i = 0; i < this.AutoParticipantes.length; i++) {
            this.AutoParticipantes[i] = new Auto(i); 
            
        }
    
    }
    
    public void CorrerCarrera(int CantidadDeVueltas){
    
        for (int vueltas = 0; vueltas < CantidadDeVueltas; vueltas++) {
            
            for (int i = 0; i < this.AutoParticipantes.length; i++) {
                
                int Random = (int) Math.random()*100;
                this.AutoParticipantes[i].AgregarTiempoRecorrido(Random);
            }
            
            
        }
    
    }
    
    }
           
    
   
    
