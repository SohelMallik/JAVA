
public class _7Predic_Output {
    
  
    
    public static int cat(int ...x){
        if(x[0] < 5){
            return 3;
        }             //  int... x  ≡  int[] x  (Varargs → Array Conversion)
        return 6;
    }
    
    public static void main (String [] args){
        System.out.println(cat(2,3));
    }
}
