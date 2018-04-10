package excepciones;

public class ImparExepcion extends Exception{
  
public ImparExepcion (String m){

    super(m);
}

    @Override
    public String toString() {
        
    return getClass() + "" + getMessage();
    
    }


    
}
