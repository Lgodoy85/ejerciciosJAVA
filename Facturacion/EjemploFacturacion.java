/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.facturacion;

/**
 *
 * @author alumno
 */
public class EjemploFacturacion {

    /**
    E-Commerce>facracion>emplaos-cliente-productos
     */
    public static void main(String[] args) {
    //Debemos registrar una venta
    Persona UnCliente = new Persona("esteban","carlos");
    Persona unEmpleado = new Persona ("martin","ignacio");

    Producto unProducto  = new Producto();
    unProducto.SetterCant(3);
    unProducto.SetterDescrip("fanta");
    unProducto.Setterprecio(35);
    
    Producto unProducto1  = new Producto();
    unProducto1.SetterCant(3);
    unProducto1.SetterDescrip("coca");
    unProducto1.Setterprecio(15);
    
    Producto unProducto2  = new Producto();
    unProducto2.SetterCant(3);
    unProducto2.SetterDescrip("pepsi");
    unProducto2.Setterprecio(25);
    
    Venta NuevaVenta = new Venta();
    NuevaVenta.Elempleado=UnCliente;
    NuevaVenta.Elcliente=unEmpleado;
//    NuevaVenta.ProductoVendido=unProducto;
//    
//    NuevaVenta.LisadoDeProductos[0]=unProducto;
//    NuevaVenta.LisadoDeProductos[1]=unProducto1;
//    NuevaVenta.LisadoDeProductos[2]=unProducto2;
//
//      NuevaVenta.CargarProducto(unProducto);
//      NuevaVenta.CargarProducto(unProducto1);
//      NuevaVenta.CargarProducto(unProducto2);
//    NuevaVenta.CargarProducto(unProducto2); 
     
      NuevaVenta.MostrarVenta();                      
      
      NuevaVenta.Elempleado=Persona.RetornarPersonaRandom();
      NuevaVenta.Elcliente=Persona.RetornarPersonaRandom();
    
      NuevaVenta.CargarProducto(Producto.RetornarProductoRnaomd());
      NuevaVenta.CargarProducto(Producto.RetornarProductoRnaomd());
    
    
    
    
    
        
        
    }
    
}
