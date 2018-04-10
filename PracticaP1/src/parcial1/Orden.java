package parcial1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {

private List<DetalleOrden> items;
private int id;
private Date creacion;
private Date envio;

public Orden(int id, Date creacion) {
this.id = id;
this.creacion = creacion;
items= new ArrayList<>();

}

public void agregarItem (DetalleOrden Detalle){
    
    items.add(Detalle);

}

public int getNroItems(){

    return items.size();
}

public void setEnvio (Date envio){

}

public float CalcularTotalOrden(){

    int cantidadNotebook=0;
    float precioUnitario=0;
    float precioTotal = 0;
    float total;
   
    for (DetalleOrden item : items) {
      
    System.out.println("Ingrese la cantidad de notebook :"+cantidadNotebook++);

    }
    precioUnitario=cantidadNotebook*this.getNroItems();
     
    return total=precioTotal*precioUnitario;

    }


public void MostrartotalOrden (){

    StringBuilder aux = new StringBuilder();
    aux.append("total de orden" +this.CalcularTotalOrden());
    
    for (DetalleOrden item : items) {
    System.out.println(item.toString());
     
        
    }
}

}