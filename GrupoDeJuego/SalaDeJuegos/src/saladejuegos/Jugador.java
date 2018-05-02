package saladejuegos;

public class Jugador {

private int idJugador;    
private String nombre;
private String alias;
private Resultado resultado;


public Jugador(int idjugador , String nombre , String alias){
    
    this.idJugador=idjugador;
    this.nombre=nombre;
    this.alias=alias;
    
}

public void setterNombre (String nombre){

    this.nombre=nombre;
}
public String getterNombre (){

    return this.nombre;

}

public void setterAlias (String alias){

    this.alias=alias;

}

@Override
public String toString() {
return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", alias=" + alias + '}';
}


    
}
