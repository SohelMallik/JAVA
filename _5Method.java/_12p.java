public class _12p {
    public static void fun(long a) {
        System.out.println("long");
    }

    public static void fun(int... a) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        fun(10);
    }
}





// public class Demo {
//     public static void fun(long a) {
//         System.out.println("long");
//     }

//     public static void fun(int... a) {
//         System.out.println("varargs");
//     }

//     public static void main(String[] args) {
//         fun(10,5,6);
//     }
// }

