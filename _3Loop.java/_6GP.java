/*Display this GP 1,2,48,...,n term */

public class _6GP {
    public static void main(String[] sohel) {
        int n=9; //number of terms
        int a=1; // first term
        int r=2; // common ratio
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a*=r;
        }
       
        // for (int i=0; i<n; i++) {
        //     System.out.println( Math.pow(r, i));
        // }
      }
    
}
