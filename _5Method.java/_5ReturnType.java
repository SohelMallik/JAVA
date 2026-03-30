public class _5ReturnType {

    public static int max(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            return a;
        } else if (b >= a && b >= c && b >= d) {
            return b;
        } else if (c >= a && c >= b && c >= d) {
            return c;
        } else {
            return d;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(4,4,4,4));
    }

    }

