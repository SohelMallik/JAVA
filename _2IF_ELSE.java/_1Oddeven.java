import java.util.Scanner;
public class _1Oddeven {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n=sc.nextInt();

        if (n%2==0){
            System.out.println(n+" Is Even");
        } else {
            System.out.println(n+" Is Odd");
        }
        sc.close();
    }
}
