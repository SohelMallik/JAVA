import java.util.Scanner;
public class _4Profit_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Cost Price:");
        double cp= sc.nextDouble();

        System.out.print("Enter Selling Price:");
        double sp=sc.nextDouble();

        if(sp>cp)
            System.out.print("Profit is :"+((sp-cp)/cp)*100+"%");
        else if
            (cp>sp)System.out.println("Loss is :"+((cp-sp)/cp)*100+"%");
        else
             System.out.println("No Loss and No Profit");

        sc.close();
        
    }
}
