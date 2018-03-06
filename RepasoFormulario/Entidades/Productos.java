package Entidades;

public class Productos {

    String nombre;
    String precio;

public Productos(String nombre, String precio) {
    this.nombre = nombre;
    this.precio = precio;
    
    }

public String mostrarProducto(){

    return this.nombre + " " + this.precio;

}
        
}
