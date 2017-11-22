package ejemploherencia;

public class Documento {

/*Trabajo practico para el martes 
Se debe realizar el control de compras y ventas de un local , la clase articuloi
debe tener los siguientes atributos : codigo , nombre , precio de costo , precio 
de venta y stock, ademas debe tener los getters de precioventa y nombreycodigo.
Los seter de preciocosto y stock. Constructor que reciba todos los atributos por
parametros. Metodos : "Hay stocik" retorna boolean. el metodo hay stock es de instancia
el metodo estatico son iguales que recibe dos articulos y retorna booleanos, compara
si es el "nombre y el codigo " si son iguales retorna true, sino false.Clase articulo
Dos herencias : Articulo comestible que tiene fecha vencimiento y Articulo liquido que
tiene litros. Los dos reciben estos atributos por parametros de constructor.
Creamos clase venta : tiene articulo vendido que es de tipo articulo , unas cantidad que es 
entero. 
En el contructor articulo reciba todos menos el precioventa que se calcula con un 25% de
incremento sobre el precio de costo.
La clase articulo va a tener los metodos retornar ganancias de clase venta que retorna un float 
y hace la cuenta de vendidos,ganancias. Constructor recibe 2 parametros.
    
Creamos la clase Comercio que tiene un string dueño y tiene arraylist de articulos y va a tener otro
arraylist de venta. El constructor recibe el nombre del dueño.
Metodo Vender articulo recibe un articulo y una cantidad , esto crea una nueva venta y lo manda
a nuestro arraylistventa. Mostrararticulos y mostrarventas dentro de la clase articulo que muetre
todo y comprararticulos,recibe articulos y cantidad , lo mismo que vender.
Listado de ventas y de lo que vendio.

    
    
*/    
    
    
    
    
protected int _numero;

    public Documento(int numero) {
        
        this._numero=numero;
        System.out.println(" Constructor Documento ");
    }
    

public void setterNumeros(int numero){

    this._numero=numero;

}

public void MostrarNumero(){

    
System.out.println(" El numero es : "+this._numero);
    
}

public void MostrarDatosCompletos (){

    this.MostrarNumero();
    
}

}
