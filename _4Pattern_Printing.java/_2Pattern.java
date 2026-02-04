/* Print Pattern                  
                  1 2 3 4 
                  1 2 3 4
                  1 2 3 4              */
 

import java.util.Scanner;                
class _2Pattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
        System.out.print("Enter number of columns: ");
         int col=sc.nextInt();
         sc.close();

         for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print(j+" ");//print j variable
            }
            System.out.println();
         }

        }
    }
