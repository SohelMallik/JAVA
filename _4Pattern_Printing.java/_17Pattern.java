     
/* Print Pattern                   
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * *
      * * *
        *
                 
                        */
import java.util.Scanner;
public class _17Pattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
        int n=sc.nextInt();
        int st=1;
        int sp=n-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=st; k++){
                System.out.print("* ");
            }
            sp--;
            st+=2;
            System.out.println();
        }

        int sp1=1;
        int st1=(2*n-3);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp1; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=st1; k++){
                System.out.print("* ");
            }
            sp1++;
            st1-=2;
            System.out.println();
        }
    
    sc.close();
}
}
