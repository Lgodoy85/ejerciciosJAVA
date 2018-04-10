package excepciones;

public class math {
 
    public static float dividir (int n1, int n2)throws ArithmeticException{
    
        if (n2==0){
        
            throw new ArithmeticException("Imposible dividir por 0");
        }
        float r=n1/n2;
        
        return r;
    
    
    }
    
    public static int DividirPares(int n1,int n2)throws ImparExepcion{

        if (n1%n2!=0 || n2%2!=0)
        throw new ImparExepcion("imposible dividir numeros impares");
        int r =n1/n2;
        return r;
    
    
    }
    
    
     public static int dividirPorCero(int n1,int n2) throws IllegalArgumentException{
 
         if (n1%n2!=0)
       
    
   }
 }
    
    
    
}  