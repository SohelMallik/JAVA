import java.util.Scanner;
public class _3Take_Input {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] sohel=new int[6];

        // take User Input
        System.out.print("Enter the number :");
        for(int i=0; i<sohel.length; i++){
            int x=sc.nextInt();
            sohel[i]=x;
        }

        System.out.println("Output is :");
        for(int i=0; i<sohel.length; i++){
            System.out.print(sohel[i]+ " ");
        }

        
        double sum=0;
        for(int i=0; i<sohel.length; i++){
            sum= sum+sohel[i];
        }
        System.out.println(sum);
        
        sc.close();
    }
}
