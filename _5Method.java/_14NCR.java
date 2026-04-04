import java.util.Scanner;

public class _14NCR {

    public static int fact(int x){
        int f=1;
        for(int i=1; i<=x; i++){
            f=f*i;
        }
        return f;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of N:");
        int n= sc.nextInt();

        System.out.print("Enter the Number of R:");
        int r= sc.nextInt();

        int NCE= fact(n)/(fact(r)*fact(n-r));
        System.out.println("NCR is: "+NCE);

        int NR= fact(n)/fact(n-r);
        System.out.println("NR is: "+NR);
        sc.close();

    }
}
