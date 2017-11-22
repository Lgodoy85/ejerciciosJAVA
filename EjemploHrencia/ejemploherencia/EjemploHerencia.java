package ejemploherencia;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

public class EjemploHerencia {

    public static void main(String[] args) {

        FacturaA Mifactura = new FacturaA(66);
       // Mifactura.setterNumeros(66);
        Mifactura.MostrarNumero();
        
        
//        ArrayList<Documento> listado = new ArrayList<>();
//        listado.add(Mifactura);
        
        ArrayList<String> ListadoPalabras;
        ListadoPalabras = new ArrayList<String>();
        
        ListadoPalabras.add("Primera ");
        ListadoPalabras.add("Segunda");
        ListadoPalabras.add("Tercera");
        System.out.println(" Listado : "+ListadoPalabras);
        
        
        
        AlumnoEgresado unAlu = new AlumnoEgresado();
        unAlu.MostrarLosDatos();
        
        
        
        ArrayList<Persona> ListadoPersonas;
        ListadoPersonas= new ArrayList<Persona>();
        
        Alumno Unalumno = new Alumno ();       
        ListadoPersonas.add(unAlu);
        
        Persona unaPeronsa = new Persona();
        ListadoPersonas.add(unaPeronsa);
        
        
        //metodo 1 for
        for (int i = 0; i < ListadoPersonas.size(); i++) {
            
            ListadoPersonas.get(i).MostrarLosDatos();
            
        }
        
        //metodo 2 for y recomendable
          for (Persona Alguno : ListadoPersonas) {
              
              Alguno.MostrarLosDatos();
            
        }
          //hasnext para meotodo bookeab
          ListadoPalabras.iterator().hasNext();
          
          //metodo while con el for 3
          
          Persona Iterador = new Persona();
          Iterador.MostrarLosDatos();       
          Iterator<Persona> iterator= ListadoPersonas.iterator();     
          while (iterator.hasNext()){
          
          Persona nueva = iterator.next();
          nueva.MostrarLosDatos();
          
          
          ArrayList<Documento> ListadoFacturas;
          ListadoFacturas= new ArrayList<Documento>();
          
          FacturaA Facta = new FacturaA(5);
          ListadoFacturas.add(Facta);
          
          FacturaB FactaB = new FacturaB(6);
          ListadoFacturas.add(FactaB);
          
          Remito Rem = new Remito(2);
          ListadoFacturas.add(Rem);
          
          for (Documento Facturas : ListadoFacturas) {
               
          Facturas.MostrarDatosCompletos();
                 
          }
          
          
              
          }
          
          
          
          
          
        
        
        
        
        //no anda por ahora, falta el to...
        //System.out.println(" Listado : " +ListadoPersonas);
        
       
    
        
      
                
        
        
    }
    
}
