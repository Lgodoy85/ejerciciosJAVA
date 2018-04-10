package Entidades;
// Generated 28-mar-2018 13:58:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcion generated by hbm2java
 */
public class Funcion  implements java.io.Serializable {


     private int idFuncion;
     private Pelicula pelicula;
     private Salacine salacine;
     private Tipo tipo;
     private String funcionHorario;
     private Set entradas = new HashSet(0);

    public Funcion() {
    }

	
    public Funcion(int idFuncion, Pelicula pelicula, Salacine salacine, Tipo tipo) {
        this.idFuncion = idFuncion;
        this.pelicula = pelicula;
        this.salacine = salacine;
        this.tipo = tipo;
    }
    public Funcion(int idFuncion, Pelicula pelicula, Salacine salacine, Tipo tipo, String funcionHorario, Set entradas) {
       this.idFuncion = idFuncion;
       this.pelicula = pelicula;
       this.salacine = salacine;
       this.tipo = tipo;
       this.funcionHorario = funcionHorario;
       this.entradas = entradas;
    }
   
    public int getIdFuncion() {
        return this.idFuncion;
    }
    
    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Salacine getSalacine() {
        return this.salacine;
    }
    
    public void setSalacine(Salacine salacine) {
        this.salacine = salacine;
    }
    public Tipo getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public String getFuncionHorario() {
        return this.funcionHorario;
    }
    
    public void setFuncionHorario(String funcionHorario) {
        this.funcionHorario = funcionHorario;
    }
    public Set getEntradas() {
        return this.entradas;
    }
    
    public void setEntradas(Set entradas) {
        this.entradas = entradas;
    }




}

