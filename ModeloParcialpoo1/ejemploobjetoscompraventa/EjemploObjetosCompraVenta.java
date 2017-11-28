/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class EjemploObjetosCompraVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      articulo  miarticulo ;
      miarticulo = new articulo( 666,"fanta",100,3);
     
      
      articulo  miarticulo2 ;
      miarticulo2 = new articulo( 555,"sprite",80,5);
      
      articulo  miarticulo3 ;
      miarticulo3 = new articulo( 666,"fanta",80,28);
      
      Comercio ElBolicheDeTony;
      ElBolicheDeTony = new Comercio("tony");
      
      
      
      String respuesta;
      
      /*
      Compra
      */
      respuesta= ElBolicheDeTony.ComprarArticulo(miarticulo, 3);
       System.out.println("respuesta: "+respuesta);
       
      respuesta=ElBolicheDeTony.ComprarArticulo(miarticulo2, 8);
      System.out.println("respuesta: "+respuesta);
      
      respuesta=ElBolicheDeTony.ComprarArticulo(miarticulo3, 3);
      System.out.println("respuesta: "+respuesta);
      
      /*
      venta
      */
      respuesta=ElBolicheDeTony.VenderArticulo(miarticulo, 10);
      System.out.println("respuesta: "+respuesta);
      
      
    }
    
}
