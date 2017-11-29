package ejemploproductocontainer;

public class EjemploProductoContainer {

    public static void main(String[] args) {

        Producto miproducto            = new Producto(15,"Bicicleta", 2000);
//      ProductosNacionales nacional   = new ProductosNacionales("La Pampa", 1, "mesa", 35);
        ProductosImportados importado  = new ProductosImportados("Brasil", 2, "zapatos", 15, 35); 
       
        
        ProductosNacionales naciona1   = new ProductosNacionales("La Pampa", 1, "mesa", 1500);
        ProductosNacionales nacional2  = new ProductosNacionales("Cordoba", 2, "mesa", 3500);
        ProductosNacionales nacional3  = new ProductosNacionales("Misiones", 3, "mesa", 8000);
        
        
//        Producto a = new Producto(99, "dasd", 20);
//        Producto b = a;
//        b._precio=999;        
//        System.out.println(" El precio es : " +a.GetterPrecio());
//             
//        
//        Container con = new Container(10);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        con.CargarProducto(a);
//        b._precio=150;
        
        
        Container Micon = new Container(10);
        Micon.CargarProducto(miproducto);
        Micon.CargarProducto(naciona1);
//      Micon.CargarProducto(importado);
        Micon.CargarProducto(nacional2);
        Micon.CargarProducto(nacional3);     
       
        
        System.out.println("Producto : " +miproducto.toString()); 
          
        
        if (Micon.CargarProducto(miproducto)){
        
            System.out.println(" Cargo el producto ");
        }
        else
        {
            System.out.println(" No cargo ");
        }
        
        
          if (Micon.CargarProducto(naciona1)){
        
            System.out.println(" Cargo el producto ");
        }
        else
        {
            System.out.println(" No cargo ");
        }
        

        if (Micon.CargarProducto(importado)){
        
            System.out.println(" Cargo el producto ");
        }
        else
        {
            System.out.println(" No cargo ");
        }
         Micon.Ordenar();
        Micon.MostrarContainer();
         //Mostramos la informacion del objeto
//        System.out.println(Micon.toString());
//        System.out.println(naciona1.toString());
//        System.out.println(nacional2.toString());
    }
        }
        
    
    

