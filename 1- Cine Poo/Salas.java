package cine;

public class Salas {

    private Butacas asientos[];
    private double precio;
    private Pelicula pelicula;

    /*Constructor*/
    public Salas (double precio, Pelicula pelicula) {

        this.precio = precio;
        this.pelicula = pelicula;
        
    }

    /*Metodos*/
    public Butacas[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Butacas[] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void mostrar() {

        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
       
        }
    }



    



