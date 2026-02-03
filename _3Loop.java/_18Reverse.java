import java.util.Scanner;

public class _18Reverse {
    public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        sc.close();

      
        if(n<0){
            n=-n; // Make n positive if it's negative
        }
        
        int r = 0;

        while (n != 0) {
            r=r*10;
            r+= n % 10;
            n/= 10;
           
        }

        System.out.println("Reversed number: " + r);
    }
}
