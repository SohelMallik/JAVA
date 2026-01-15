import java.util.Scanner;
public class _6Input_sum {
    public static void main(String[] args) {
        Scanner sohel= new Scanner(System.in); // Only one time initilize

        System.out.print("Enter 1st Integer:");
        int x= sohel.nextInt();

        System.out.print("Enter 2nd Integer:");
        int y= sohel.nextInt();
       

        System.out.println("Sum Is :"+ (x+y));
        sohel.close();

    }
}
