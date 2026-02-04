     
/* Print Pattern                  
                  
1
A B
1 2 3 
A B C D
1 2 3 4 5            */
                   
 

import java.util.Scanner;                
class _6Letter_number {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
         sc.close();

         for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if(i%2!=0)
                    System.out.print(j+" ");//print j variable as character
                else
                System.out.print((char)(j+64)+" ");//print j variable as character
            }
            System.out.println();
         }

        }
    }
