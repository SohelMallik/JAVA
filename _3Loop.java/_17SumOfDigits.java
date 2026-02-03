import java.util.Scanner;

public class _17SumOfDigits {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        sc.close();

        if(n==0){
            System.out.println("Sum of digits: 0");
            return;
        }

        if(n<0){
            n=-n; // Make n positive if it's negative
        }
        
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits: "+sum);
        
    }
}
