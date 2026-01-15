import java.util.Scanner;

public class _7Simple_Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double x;
        System.out.print("Enter Principle(intial amount of mony):");
        double p= sc.nextDouble();
       
        System.out.print("Enter Rate of Interest(%):");
        double r= sc.nextDouble();
        
        
        System.out.print("Enter Time:");
        double t= sc.nextDouble();

        x= (p*r*t/100);

        System.out.println("Simple Interest is :"+ x);
        sc.close();
    

    }
}
