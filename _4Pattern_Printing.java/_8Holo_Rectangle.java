     
/* Print Pattern                  
                  
* * * * * * *         
*           *       
*           * 
*           *
* * * * * * *    
          
                                      */
                

import java.util.Scanner;                
class _8Holo_Rectangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
         int n=sc.nextInt();
         System.out.print("Enter number of columns: ");
         int m =sc.nextInt();
         sc.close();
         
         for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");//print j variable as character
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
         
         // for(int i=row; i>=1; i--){
         //    for(int j=1; j<=i; j++){
         //     System.out.print(j+" ");//print j variable as character
         //     //System.out.print("* ");
         //    }
         //    System.out.println();
         // }

        }
    }
