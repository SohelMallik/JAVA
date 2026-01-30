    import java.util.Scanner;

public class _10Factor { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        sc.close();
        if(n==1 || n==0){
            System.out.println("1 and 0 have infinite factors.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
    

