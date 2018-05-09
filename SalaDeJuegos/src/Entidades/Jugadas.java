package Entidades;

import Entidades.Juego;
import Enumerados.Resultado;
import java.util.ArrayList;
import java.util.List;

public class Jugadas {
    
private List<Jugador> mijugador;
private Juego mijuego;
private Resultado resultado;

    public Jugadas(Juego mijuego, Resultado resultado) {

    this.mijuego = mijuego;
    this.resultado = resultado;
    this.mijugador = new ArrayList<Jugador>();
        
    }

    public void AgregarJugador(Jugador jugador1){
    
        
    this.mijugador.add(jugador1);
      
    
    }
    public boolean borrarjugador(Jugador jugador1){
        
        
        for (Jugador jugador : mijugador) {
            
        if (mijugador.remove(jugador1)){          
        return true;
        }            
        }
  
        return false;
    
    }
    public void listarjugador(){
    }
    public void FiltrarJugador(){
    }


    public Juego getMijuego() {
        return mijuego;
    }

    public void setMijuego(Juego mijuego) {
        this.mijuego = mijuego;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Jugadas{" + "mijugador=" + mijugador + ", mijuego=" + mijuego + ", resultado=" + resultado + '}';
    }

 
 
    
}
