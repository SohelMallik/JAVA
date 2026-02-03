import java.util.Scanner;

public class _19Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");       
        int n = sc.nextInt();
        sc.close(); 
        
        if(n==0){
            System.out.println("Factorial of 0 is: 1");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
