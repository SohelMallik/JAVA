
/* Print Pattern                  
1 1 1 1 
1 2 2 2 
1 2 3 3
1 2 3 4
          
                                      */



import java.util.Scanner;
public class _19Square {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(Math.min(i,j));

            }
            System.out.println();
        }

    }
    
}
