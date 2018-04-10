package parcial1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
private String nombre;
private int dni;
private List<Orden> Ordenes;

public Cliente(String nombre, int dni) {
    
this.nombre = nombre;
this.dni = dni;
Ordenes=new ArrayList<>();

}

public String getNombre(){

    return this.nombre;

}
public int getDni(){

    return this.dni;

}

public void addOrden(Orden o){

    Ordenes.add(o);

}  

public void obtenerOrdenConMasItems(){

    int n = Ordenes.size();
    int k;
    for(int m=n; m>0; m--){
    for (int i=0; i<n-1; i++){
    k=1+i;
    if (Ordenes.get(i).getNroItems()>Ordenes.get(k).getNroItems()){
    Orden temp = Ordenes.set(i, Ordenes.get(k));
    Ordenes.set(k, temp);
    
    }
    
    }    
    
    }

}
}
