import java.util.Scanner;
public class _7Max_of_Array {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max= arr[i];
        }
        System.out.println("Max is :"+max);

    }
    
}
