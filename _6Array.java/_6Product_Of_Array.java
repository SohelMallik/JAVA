import java.util.Scanner;
public class _6Product_Of_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long product = 1;

        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }

        System.out.println("Product of array = " + product);

        sc.close();
    }
}

