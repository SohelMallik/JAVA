
     
/* Print Pattern                  
                  
1
0 1
1 0 1
0 1 0 1 
1 0 1 0 1            */
                   
 

import java.util.Scanner;                
class _11Binary{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int row=sc.nextInt();
         sc.close();
      
         for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
               if((i+j)%2==0){
                System.out.print("1 ");//print j variable as character
               } else {
                System.out.print("0 ");
               }
            }
            System.out.println();
         }

        }
    }


