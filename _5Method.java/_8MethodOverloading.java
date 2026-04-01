public class _8MethodOverloading {
    
    public static void fun(int a) {
        System.out.println("int");
    }

    public static void fun(double a) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        fun(5);
        fun(5.5);
    }
}

