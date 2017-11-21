package cine;

public class Espectadores {
  
    private String _nombre;
    private String _apellido;
    private double dinero;

    public Espectadores(String _nombre, int _edad, String _apellido, double dinero) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this.dinero = dinero;
}

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }


    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    @Override
    public String toString() {
        return "el nombre del espectador es " + _nombre+_apellido +  " y con " + dinero + " pesos en su bolsillo";
    }

}
