package Entidades;

import java.util.ArrayList;

public abstract class Pelicula {
    
   ArrayList Nombre;
   ArrayList Genero;

   public Pelicula (ArrayList Nombre, ArrayList Genero){
       
       this.Nombre = Nombre;
       this.Genero = Genero;
   
   }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getGenero() {
        return Genero;
    }

    public void setGenero(ArrayList Genero) {
        this.Genero = Genero;
    }
   
   public abstract void IngresarNombre(String nombres);
   public abstract void IngresarGenerto(String genero);
   public abstract void EliminarNombre (String nombres);
   public abstract void EliminarGenero (String generos);
    
}
