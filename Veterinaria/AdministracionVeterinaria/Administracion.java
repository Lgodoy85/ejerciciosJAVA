package AdministracionVeterinaria;

public class Administracion {

    public static void main(String[] args) {
      //Mascota micas = new Mascota("Pol", "Caniche Toy", "hembra");
        
        Perro miperro = new Perro(true , Tamaño.grande, "Deisy", "Rotwailler", "Macho");
        
        Gato Migato = new Gato(false, "Enzo", "Siames", "hembra");
        
       Veterinaria vet = new Veterinaria("Veterinaria de leo ", "Leonel", 1000 ,3000);
       vet.IngresarAnimal(miperro);
       vet.IngresarAnimal(Migato);
       vet.MostrarVeterinaria();
       
       System.out.println(" Total facturado por tipo perro : "  );
       vet.MostrarTotalFacturadoPorTipo("perro");
       
       
       System.out.println(" Total facutrado por tipo gato : " );
       vet.MostrarTotalFacturadoPorTipo("gato");
      
        
        System.out.println(" Total facturado : ");
        vet.MostrarTotalFacturado();
        
        
        
    }
    
}
