     
/* Print Pattern                  
                  
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5            */
                   
 

import java.util.Scanner;                
class _5Triangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
         sc.close();

         for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");//print j variable as character
            }
            System.out.println();
         }

        }
    }

