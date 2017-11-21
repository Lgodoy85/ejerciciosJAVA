package cine;

public class Funciones {

    private int _duracion;
    private int _diasemana;
    private int _horainicio;
    private int _hora;
    private int _numerofun;
    private Salas sala;

   

    public Funciones(int _duracion, int _diasemana, int _horainicio, int _hora, int _numerofun, Salas sala) {
        this._duracion = _duracion;
        this._diasemana = _diasemana;
        this._horainicio = _horainicio;
        this._hora = _hora;
        this._numerofun = _numerofun;
        this.sala=sala;
    }
    
    public int CalcularDisponibilidad(){
    
        return 0;
    }
    
    public boolean EstaEnCurso (){
    
        return false;
    }
    
    public boolean HayLugar (){
    
        return true;
    
    }
    
    public String MostrarDiaHora(){
    
        return null;
    }

    public int getDuracion() {
        return _duracion;
    }

    public void setDuracion(int _duracion) {
        this._duracion = _duracion;
    }

    public int getDiasemana() {
        return _diasemana;
    }

    public void setDiasemana(int _diasemana) {
        this._diasemana = _diasemana;
    }

    public int getHorainicio() {
        return _horainicio;
    }

    public void setHorainicio(int _horainicio) {
        this._horainicio = _horainicio;
    }

    public int getHora() {
        return _hora;
    }

    public void setHora(int _hora) {
        this._hora = _hora;
    }

    public int getNumerofun() {
        return _numerofun;
    }

    public void setNumerofun(int _numerofun) {
        this._numerofun = _numerofun;
    }
   
    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Funciones{" + "_duracion=" + _duracion + ", _diasemana=" + _diasemana +
        ", _horainicio=" + _horainicio + ", _hora=" + _hora + ", _numerofun=" + _numerofun + sala + '}';
    }

    

    
}

