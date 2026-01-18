/*Take N as Input and print 1 n 2 n-1 3 n-2 ... */
import java.util.Scanner;

public class _8Nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i );
            System.out.println(n-i+1);
        }
        sc.close();
    }
}
