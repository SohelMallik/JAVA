import java.util.Scanner;
public class _3Check_Integer {
    public static void main (String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Number:");
       double n=sc.nextDouble();
       
    //    int m=(int)n;
    //    if (n-m==0){
    //        System.out.println(n+" is an Integer");
    //    } else {
    //        System.out.println(n+" is not an Integer");
    //    }

    if(n-(int)n==0)System.out.println(n+" is an Integer");
    else System.out.println(n+" is not an Integer");

       sc.close();
    }
}
