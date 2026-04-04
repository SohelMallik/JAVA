public class _13FloatValuePass{
    public static void fun(float a) {
        System.out.println("float");
    }

    public static void fun(int... a) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        fun(10.3f);   // ✅ fixed (float literal)
    }
} 

    

