import java.util.Scanner;
public class _9Prime {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number to check if it's prime:");
       int n=sc.nextInt();
       sc.close();

        boolean isPrime = true;
        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(n==1 || n==0){
            System.out.println(n + ":  is neither prime nor composite.");
        }
        else if (isPrime==true) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is a composite number.");
        }
    }
}
