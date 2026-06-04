// public class _10Shallow_Deep_cpoy {

//     public static void main(String[] args) {
//         int[] arr1 = {10, 20, 30};
//         int[] arr2 = arr1;

//         arr2[0] = 100;

//         System.out.println(arr1[0]);
//     }
// }
    
// Deep copy

import java.util.Arrays;

public class _10Shallow_Deep_cpoy {

    // public static void main(String[] args) {
    //     int[] arr1 = {10, 20, 30};
    //     int [] arr2= Arrays.copyOf(arr1, arr1.length);

    //     System.out.println(arr2[0]);
    // }



    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1.clone();

        arr2[0] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}

