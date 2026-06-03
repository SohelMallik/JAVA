public class _8Find_Max_Min {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 3, 30};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
    

