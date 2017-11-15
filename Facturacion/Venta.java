    package ejemplo.facturacion;

import java.util.Objects;

    public class Venta {
 
    public Persona Elcliente;
    public Persona Elempleado;
    //public Producto ProductoVendido;
    public Producto[] LisadoDeProductos;
    
    private int RetornarPrimerLugarLibre (){
    
        int retorno = -1;
        
        for (int i = 0; i < this.LisadoDeProductos.length; i++) {
        
            if (Objects.isNull(this.LisadoDeProductos[i]) == true ){
            retorno = i;
            //otra opcion = return = i;
            
            
            return retorno;
            }
            }
          return retorno;
    
    }
    
    public void CargarProducto (Producto unProductoParaAgregar){
    
        int indice;
        indice = this.RetornarPrimerLugarLibre();
        if (indice>-1){
        this.LisadoDeProductos[indice]=unProductoParaAgregar;
        
        } 
        else
        {
            System.out.println(" No hay lugar ");
        }
        
//    if (Objects.isNull(this.LisadoDeProductos[0]) == true ){
//        this.LisadoDeProductos[0]=unProductoParaAgregar;
//    }
//    else
//    {
//    if (Objects.isNull(this.LisadoDeProductos[1]) == true ){
//        this.LisadoDeProductos[1]=unProductoParaAgregar; }
//    else
//    if (Objects.isNull(this.LisadoDeProductos[2]) == true ){
//        this.LisadoDeProductos[2]=unProductoParaAgregar;
//    }  
//    else 
//    {    
//        System.out.println(" No hay mas lugar ");
//            
//    }
//    }}
    }   
    public Venta(){
    
        this.LisadoDeProductos = new Producto[4];
        
    }
    
    public void MostrarVenta(){
    
        System.out.println(" El empleado es : ");
        Elempleado.MostrarPersona();
        System.out.println(" El cliente es : ");
        Elcliente.MostrarCliente();
        System.out.println(" El producto es : ");
        //ProductoVendido.MostrarProducto();
        
       
        
        for (int i = 0; i < this.LisadoDeProductos.length; i++) {
            
        if (Objects.isNull(this.LisadoDeProductos[i]) == false)     
        this.LisadoDeProductos[i].MostrarProducto();
        }
        
        float aux=0;
        //aux= ProductoVendido.DameElPrecioFinal();
       
       // aux = this.LisadoDeProductos[0].DameElPrecioFinal()+this.LisadoDeProductos[1].DameElPrecioFinal()+
       // this.LisadoDeProductos[5].DameElPrecioFinal();
        
        for (int i = 0; i < this.LisadoDeProductos.length; i++) {
        
         if (Objects.isNull(this.LisadoDeProductos[i]) == false ){
                
        aux=aux + this.LisadoDeProductos[i].DameElPrecioFinal();
            
        }}

        System.out.println(" El importe a pagar es : "+aux);
      
    
    }
    
}
