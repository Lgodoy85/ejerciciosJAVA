package parcial1;

public class DetalleOrden {
 
private Notebook item;
private float precioUnitario;
private int cantidad;

public DetalleOrden(Notebook item, float precioUnitario, int cantidad){

    this.cantidad=cantidad;
    this.item=item;
    this.precioUnitario=precioUnitario;

}

public float getPrecioUnitario(){

    return this.precioUnitario;

}

public int getCantidad(){

    return this.cantidad;

}

public Notebook getItem(){

    return this.item;

}

    
    
}
