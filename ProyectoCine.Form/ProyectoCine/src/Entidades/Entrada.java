package Entidades;
// Generated 28-mar-2018 13:58:37 by Hibernate Tools 4.3.1



/**
 * Entrada generated by hbm2java
 */
public class Entrada  implements java.io.Serializable {


     private int idEntrada;
     private Butaca butaca;
     private Funcion funcion;

    public Entrada() {
    }

    public Entrada(int idEntrada, Butaca butaca, Funcion funcion) {
       this.idEntrada = idEntrada;
       this.butaca = butaca;
       this.funcion = funcion;
    }
   
    public int getIdEntrada() {
        return this.idEntrada;
    }
    
    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }
    public Butaca getButaca() {
        return this.butaca;
    }
    
    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    public Funcion getFuncion() {
        return this.funcion;
    }
    
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }




}


