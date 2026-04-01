public class _9VarargsVsNormal {
   
    public static void fun(int a, int b) {
        System.out.println("normal");
    }

    public static void fun(int... a) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        fun(2, 3);
    }
}
