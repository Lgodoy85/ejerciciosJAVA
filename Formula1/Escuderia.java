/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula.pkg1;

/**
 *
 * @author pc
 */
public class Escuderia {
    
    public String pais;
    public String nombre;
    public int AñoFundacion;
    
    public Escuderia(){  //Los constructores tienen el nombre de la clase
    
        this.pais="Argentina";
        this.nombre="Ferrari";
        this.AñoFundacion=1997;
    
    }
    
    //Asignamos el valor del pais,año y nombre
    public void Setterpais (String pais){
        
        this.pais=pais;    
    
    }
    
    public void SetterAño (int año){
    
        this.AñoFundacion=año;
    
    
    }
    
    public void SetterNombre (String nombre){
    
        this.nombre=nombre;
    
    }
    
    public String NombreEscuderiaPais(){
    
        String retorno = "";
        
        retorno = this.nombre+""+this.pais+""+this.AñoFundacion;
        
        return retorno;
    
    
    }
    
    
}
