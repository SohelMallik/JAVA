
     
/* Print Pattern                  
                  
    *        
    *              
* * * * *      
    *        
    *
          
                                      */
                

import java.util.Scanner;                
class _9Star_Plus {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int n=sc.nextInt();
      
         sc.close();
         
         for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( i==(n+1)/2 || j==(n+1)/2){
                    System.out.print("* ");//print j variable as character
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }

        }
    }
