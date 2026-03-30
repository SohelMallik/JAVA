import java.util.*;

public class _3MaximumOfFourNum {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the First number:");
    int x= sc.nextInt();
    System.out.print("Enter the second  number:");
    int y= sc.nextInt();
    System.out.print("Enter the Thire number:");
    int z= sc.nextInt();
    System.out.print("Enter the Fourth Number:");
    int a= sc.nextInt();

    System.out.println(Math.max(Math.max(Math.max(x,y),z),a));

    sc.close();
    }

}
