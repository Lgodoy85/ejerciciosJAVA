package excepciones;

public class Excepciones {

    public static void main(String[] args){

//        float r = Calculos.dividir(0, 0);
//        System.out.println("El resultado es : "+r); 
                 
   
        try {
        float r = Calculos.dividir(0, 0);
        //int i = Calculos.dividirpares(0, 0);
        System.out.println("El resultado es : "+r);   
        
        } catch (ArithmeticException e) {
            
        System.out.println(e.toString());
        }
        catch (IllegalArgumentException e){
//        
//        int j = ceroException.Numerocero(4);
//        System.out.println(" El resultado es "+ j);
        }
        
        catch (Exception e){
        
        System.out.println("Eroor aritmetico"+e.toString());
        }
        
        
        
        
    }
    
}
