package cine;

import java.time.LocalDateTime;
import java.util.Date;

public class Pelicula {
    
    private byte _id;
    private String _Nombre;
    private String _Director;
    private String _Genero;
    private int _anyo;
    private String _PaisDeOrigen;
    private Date _Lanzamiento;
    private int _duracion;
    private boolean disponible;
    
    

public Pelicula(byte id ,String _Nombre, String _Genero, int _anyo, String _PaisDeOrigen, int _Lanzamiento,
int _duracion, boolean disponible, String _Director) {
    this._id= id;
    this._Nombre = _Nombre;
    this._Genero = _Genero;
    this._anyo = _anyo;
    this._PaisDeOrigen = _PaisDeOrigen;
    this._Lanzamiento = java.sql.Timestamp.valueOf(LocalDateTime.now());
    this._duracion = _duracion;
    this.disponible = disponible;
    this._Director = _Director;   

    }
    public String MostrarFuncionesHabilitadas(){
    
        return null;
    }
    
    public byte getid (){
    return _id;
    }
    public void setid(byte id){
    
        this._id=id;
    }

    public String getNombre() {
        return _Nombre;
    }

    public void setNombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    public String getDirector() {
        return _Director;
    }

    public void setDirector(String _Director) {
        this._Director = _Director;
    }

    public String getGenero() {
        return _Genero;
    }

    public void setGenero(String _Genero) {
        this._Genero = _Genero;
    }

    public int getAnyo() {
        return _anyo;
    }

    public void setAnyo(int _anyo) {
        this._anyo = _anyo;
    }

    public String getPaisDeOrigen() {
        return _PaisDeOrigen;
    }

    public void setPaisDeOrigen(String _PaisDeOrigen) {
        this._PaisDeOrigen = _PaisDeOrigen;
    }

    public int getDuracion() {
        return _duracion;
    }

    public void setDuracion(int _duracion) {
        this._duracion = _duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean estaenCartelera(){
    
        return true;
    }

    @Override
    public String toString() {
    return "Pelicula{" + "_id=" + _id + ", _Nombre=" + _Nombre + ", _Director=" + _Director
    + ", _Genero=" + _Genero + ", _anyo=" + _anyo + ", _PaisDeOrigen=" + _PaisDeOrigen + 
    ", _Lanzamiento=" + _Lanzamiento + ", _duracion=" + _duracion + ", disponible=" + disponible + '}';
    }
    
}
