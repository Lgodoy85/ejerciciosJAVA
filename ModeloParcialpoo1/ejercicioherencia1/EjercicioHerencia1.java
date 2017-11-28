package ejercicioherencia1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjercicioHerencia1 {

/**
Trabajo practico para el martes 
Se debe realizar el control de compras y ventas de un local , la clase articuloi
debe tener los siguientes atributos : codigo , nombre , precio de costo , precio 
de venta y stock, ademas debe tener los getters de precioventa y nombreycodigo.
Los seter de preciocosto y stock. Constructor que reciba todos los atributos por
parametros. Metodos : "Hay stocik" retorna boolean. el metodo hay stock es de instancia
el metodo estatico "soniguales" que recibe dos articulos y retorna booleanos, compara
si es el "nombre y el codigo " si son iguales retorna true, sino false.Clase articulo
Dos herencias : Articulo comestible que tiene fecha vencimiento y Articulo liquido que
tiene litros. Los dos reciben estos atributos por parametros de constructor.
Creamos clase venta : tiene articulo vendido que es de tipo articulo ,cantidad que es 
entero. 
En el contructor articulo reciba todos menos el precioventa que se calcula con un 25% de
incremento sobre el precio de costo.
La clase articulo va a tener los metodos retornar ganancias de clase venta que retorna un float 
y hace la cuenta de vendidos,ganancias. Constructor recibe 2 parametros.
    
Creamos la clase Comercio que tiene un string dueño y tiene arraylist de articulos y va a tener otro
arraylist de venta. El constructor recibe el nombre del dueño.
Metodo Vender articulo recibe un articulo y una cantidad , esto crea una nueva venta y lo manda
a nuestro arraylistventa. Mostrararticulos y mostrarventas dentro de la clase articulo que muestre
todo y comprararticulos,recibe articulos y cantidad , lo mismo que vender.
Listado de ventas y de lo que vendio.

*/
    
    
    public static void main(String[] args) {

        Articulo miarticulo = new Articulo(22, "Coca Cola ", 22, 150);
        Articulo miarticulo1 = new Articulo(35, "Pepsi ", 19, 410);
        Articulo miarticulo2 = new Articulo(15, "Sprite ", 22, 320);
        
//        Venta nuevaVenta = new Venta(miarticulo, 2);
     
        
       
        
        
    }
    
}
