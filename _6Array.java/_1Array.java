public class _1Array {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Declaration and initialization of an array of integers with size 5

        // Assigning values to the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing and printing the values of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}