import java.util.Scanner;

public class _5Sum {
    public static void main(String[]  args){
        Scanner sa= new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sa.nextInt();
        int [] arr=new int [n];
        // TAKE ARRAY INPUT
        System.out.print("Enter number :");
        for (int i=0; i<arr.length; i++){
            arr[i]=sa.nextInt();
        }
        
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum is:"+sum);


    }
}

    
