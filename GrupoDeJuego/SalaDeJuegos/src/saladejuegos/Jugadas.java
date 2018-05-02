package saladejuegos;

public class Jugadas {
    
private Jugador Mijugador;
private Juego mijuego;
private Resultado resultado;

    public Jugadas(Jugador Mijugador, Juego mijuego, Resultado resultado) {
        this.Mijugador = Mijugador;
        this.mijuego = mijuego;
        this.resultado = resultado;
    }

    public Jugador getMijugador() {
        return Mijugador;
    }

    public void setMijugador(Jugador Mijugador) {
        this.Mijugador = Mijugador;
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
        return "Jugadas{" + "Mijugador=" + Mijugador + ", mijuego=" + mijuego + ", resultado=" + resultado + '}';
    }

 
    
}
