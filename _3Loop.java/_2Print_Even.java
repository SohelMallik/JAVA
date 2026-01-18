import java.util.Scanner;
public class _2Print_Even {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=so.nextInt();

        for (int i = 0; i <= n; i+=1) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        so.close();
    }
}