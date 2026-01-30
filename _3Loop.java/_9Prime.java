import java.util.Scanner;

public class _9Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        sc.close();

        // 0 and 1 are neither prime nor composite
        if (n == 0 || n == 1) {
            System.out.println(n + " is neither prime nor composite.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is a composite number.");
        }
    }
}
