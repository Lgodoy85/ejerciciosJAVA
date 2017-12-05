package AdministracionVeterinaria;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
/*
-Nombre
-Dueño
-ListadoDeMascotas
-PrecioGato
-PrecioPerro
+Constructor , recibe todo menos la lista que la inicializa en el constructor
+IngresarAnimal()
+MostrarTotalFacturado()
+ MostrarTotalFacturadoPorTipo(string tipo)
+toString()
+MostrarVeterinaria()
*/
public class Veterinaria {
  
    private String _nombre;
    private String _dueño;
    private int _listadoDeMascotas;
    private float _preciogato;
    private float _precioperro;
    ArrayList<Mascota> _MisMascotas;
    

    public Veterinaria (String nombre, String nombreDueño, float PrecioGato,float PrecioPerro)
    {
        
        this._nombre=nombre;
        this._dueño=nombreDueño;
        this._preciogato=PrecioGato;
        this._precioperro=PrecioPerro;
        this._MisMascotas=new ArrayList<Mascota>();
    }
    
    public void setPreciototal(int preciogato, int precioperro) {
        this._preciogato = preciogato + precioperro;
    }
    
    
    
    public void IngresarAnimal (Mascota unamascota){
  
        this._MisMascotas.add(unamascota);
        
        }

   
    public void TipoAnimal(Mascota a){
    
        if (a instanceof Perro){
            System.out.println(a.getClass()+"soy de tipo perro ");
        }
        
        if (a instanceof Gato){
            System.out.println(a.getClass()+"soy de tipo gato ");
    
    }
    }
    
    
  public void MostrarTotalFacturado()
    {   int cantidadDePerros=0;
        int cantidadDeGatos=0;
        float TotalFacturadoPerro=0;
        float TotalFacturadoGato=0;
        float total;
        
        for (Mascota mascotas : _MisMascotas) 
        {
           if(mascotas instanceof Perro)
            {
             cantidadDePerros++;
            } 
        }
         TotalFacturadoPerro=cantidadDePerros*this._precioperro;
         
        for (Mascota mascotas : _MisMascotas) 
         {
            if(mascotas instanceof Gato)
            {
              cantidadDeGatos++;
            } 
        }
            TotalFacturadoGato=cantidadDeGatos*this._preciogato; 
            
        total=TotalFacturadoPerro+TotalFacturadoGato;
        
        System.out.println("El total facturado es: "+total);
    }
    
  
  
    public void MostrarTotalFacturadoPorTipo(String tipo)
    {   int cantidadDePerros=0;
        int cantidadDeGatos=0;
        float TotalFacturadoPerro=0;
        float TotalFacturadoGato=0;
        
        if(tipo.equalsIgnoreCase("perro"))
        {
            for (Mascota mascotas : _MisMascotas) 
            {
                if(mascotas instanceof Perro)
                {

                  cantidadDePerros++;
                } 
            }
         TotalFacturadoPerro=cantidadDePerros*this._precioperro;
         
            System.out.println(TotalFacturadoPerro);
        }else
        {
            if(tipo.equalsIgnoreCase("gato"))
            {
                for (Mascota mascotas : _MisMascotas) 
                {
                    if(mascotas instanceof Gato)
                    {

                      cantidadDeGatos++;
                    } 
                }
                TotalFacturadoGato=cantidadDeGatos*this._precioperro;
                
                System.out.println(TotalFacturadoGato);
            }
        }
      
    }
    
    public void MostrarVeterinaria(){
    
        StringBuilder aux = new StringBuilder();
        aux.append("Nombre : " +this._nombre);
        aux.append("Dueño : " +this._dueño);
        aux.append("Precio perro : " +this._precioperro);
        aux.append("Precio Gato : " +this._preciogato);
        
        for (Mascota MisMascota : _MisMascotas) {
            
            System.out.println(MisMascota.toString());
            
        }
    
    
    }
    
}
