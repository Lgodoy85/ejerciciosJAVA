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

    float total=0;
   
    for (int i = 0; i < this.items.size(); i++) {
        for (int j = 0; j < items.get(i).getCantidad(); j++) {
            
            total+=this.items.get(i).getPrecioUnitario();
            
        }
    }
    return total;
        
    }
}


