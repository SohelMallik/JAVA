     
/* Print Pattern                  
                  
      *
    * *
  * * *
* * * *            */
                   
 

import java.util.Scanner;                
class _13FlipTriangle{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
         sc.close();
       
         for(int i=1; i<=row; i++){

            for(int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
               System.out.print("* ");
            }
            System.out.println();
         }

        }
    }


