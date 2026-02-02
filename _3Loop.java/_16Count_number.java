import java.util.Scanner;
public class _16Count_number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        sc.close();

        if(n==0){
            System.out.println("Number of digits: 1");
            return;
        }
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Number of digits: "+count);
        
    }
}
