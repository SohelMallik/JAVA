     
/* Print Pattern                  
                  A B C D
                  A B C D
                  A B C D              */
                   
 

import java.util.Scanner;                
class _3Letter {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
        System.out.print("Enter number of columns: ");
         int col=sc.nextInt();
         sc.close();

         for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print((char)(j+64)+" ");//print j variable as character
            }
            System.out.println();
         }

        }
    }
