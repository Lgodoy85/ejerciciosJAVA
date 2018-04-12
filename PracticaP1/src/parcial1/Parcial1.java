package parcial1;

import java.util.Date;
import javax.swing.JOptionPane;

public class Parcial1 {

    public static void main(String[] args) {
 
       Notebook Apple = new Notebook("Apple", "2018", "Intel Celeron", 3000);
       Notebook hp = new Notebook("hp", "2018", "Intel Dual Core", 7000);
       
       DetalleOrden compra= new DetalleOrden(hp, 1500, 4);
       DetalleOrden compra1= new DetalleOrden(Apple, 35000, 6);
       
       java.util.Date FechaActual = new java.util.Date();
       
       Orden miord = new Orden(5, FechaActual);
       
       miord.agregarItem(compra);
       miord.agregarItem(compra1);
       
       JOptionPane.showMessageDialog(null,"Precio total de la compra : "+ miord.CalcularTotalOrden());
        
               
       
       
        
////Ejercicio 11            A = F 
////                        B = V
////                        C = F
////                        D = V
////                        E = F
////                        F = F
////                        G = V
    }
    
}
