import java.util.Scanner;
public class _5FourDigit_Number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num=sc.nextInt();

        if (num>=1000 && num<=9999){
            System.out.println(num+" is a Four Digit Number");
        } else {
            System.out.println(num+" is not a Four Digit Number");
        }
        sc.close();
    }
}
