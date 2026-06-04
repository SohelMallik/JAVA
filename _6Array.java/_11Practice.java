//import java.utill.Scanner;
public class _11Practice {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter size of array: ");
        // int n=sc.NextInt();

        // int [] arr= new arr[n];

        // for(int i=0; i<arr.length; i++){
        //     arr[i]=sc.nextInt();
        // }

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
