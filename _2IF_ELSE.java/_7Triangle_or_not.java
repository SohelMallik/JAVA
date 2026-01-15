import java.util.Scanner;

public class _7Triangle_or_not {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side:");
        int a=sc.nextInt();
        System.out.print("Enter the second side:");
        int b=sc.nextInt();
        System.out.print("Enter the third side:");
        int c=sc.nextInt();
        
        if (a+b>c && b+c>a && c+a>b){
            System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle can not be formed");
        }
        sc.close();
    }
}
