import java.util.Scanner;
public class _2Absolute {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n=sc.nextInt();

        if (n<0){
            n=-n;
        }
        System.out.println("Absolute value is: "+n);
        sc.close();

        // if (n>=0){
        //     System.out.println("Absolute value is: "+n);
        // } else {
        //     System.out.println("Absolute value is: "+(-n));
        // }



    }
}
