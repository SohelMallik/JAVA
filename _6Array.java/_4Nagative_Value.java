import java.util.Scanner;
public  class _4Nagative_Value {
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

        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) System.out.println(arr[i]+" ");
        }



    }
}
