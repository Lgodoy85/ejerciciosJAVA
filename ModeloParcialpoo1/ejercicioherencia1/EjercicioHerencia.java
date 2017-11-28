package ejercicioherencia;

import java.util.Date;
import javax.swing.JOptionPane;

public class EjercicioHerencia {

    public static void main(String[] args) {

        Articulo miarticulo = new Articulo(22, "Coca Cola ", 22, 150);
        Articulo miarticulo1 = new Articulo(5, "Fantai ", 80, 28);
        //Articulo miarticulo2 = new Articulo(15, "Sprite ", 22, 320);
        
         
        
        //Compra
        Comercio Micomer = new Comercio("tony");
        String respuesta;
        respuesta = Micomer.ComprarArticulos(miarticulo, 3);
        System.out.println(" Respuesta : "+respuesta);
        
        respuesta = Micomer.ComprarArticulos(miarticulo, 8);
        System.out.println(" Respuesta : " +respuesta);
        
        respuesta = Micomer.ComprarArticulos(miarticulo, 8);
        System.out.println(" Respuesta :  " +respuesta);
        
        //venta
        respuesta = Micomer.VenderArticulo(miarticulo1, 31);
        System.out.println(" Respuesta venta :  "+respuesta);
        
        
        

        
//        Date nueva = new Date();
//        ArticuloComestible Art = new ArticuloComestible(nueva, 32, "alfajor", 50, 19);
//        System.out.println(" Articulo Comestible :  " +Art);



        //Venta nuevaVenta = new Venta(miarticulo, 2);
        //Venta nuevaVenta1 = new Venta (miarticulo1, 3);
        
        //JOptionPane.showInputDialog(miarticulo);
       // JOptionPane.showInputDialog(nuevaVenta);
       
       
       
       
       
//        float precioventa;
//        precioventa=(float) miarticulo.getPrecioVenta();     
//        System.out.println("precio venta : "+precioventa);
    }

    
}
