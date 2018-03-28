package Entidades;
// Generated 28-mar-2018 13:58:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CentroComercial generated by hbm2java
 */
public class CentroComercial  implements java.io.Serializable {


     private int idCentroComercial;
     private String centroComercialNombre;
     private Set cines = new HashSet(0);

    public CentroComercial() {
    }

	
    public CentroComercial(int idCentroComercial, String centroComercialNombre) {
        this.idCentroComercial = idCentroComercial;
        this.centroComercialNombre = centroComercialNombre;
    }
    public CentroComercial(int idCentroComercial, String centroComercialNombre, Set cines) {
       this.idCentroComercial = idCentroComercial;
       this.centroComercialNombre = centroComercialNombre;
       this.cines = cines;
    }
   
    public int getIdCentroComercial() {
        return this.idCentroComercial;
    }
    
    public void setIdCentroComercial(int idCentroComercial) {
        this.idCentroComercial = idCentroComercial;
    }
    public String getCentroComercialNombre() {
        return this.centroComercialNombre;
    }
    
    public void setCentroComercialNombre(String centroComercialNombre) {
        this.centroComercialNombre = centroComercialNombre;
    }
    public Set getCines() {
        return this.cines;
    }
    
    public void setCines(Set cines) {
        this.cines = cines;
    }




}


