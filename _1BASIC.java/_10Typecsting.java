public class _10Type_csting {
    public static void main(String[] args) {
        // //Implicit Type Casting
        // int a= 10;
        // double b= a; // int to double
        // System.out.println("Value of b: "+b);

        // //Explicit Type Casting
        // double x= 9.78;
        // int y= (int)x; // double to int
        // System.out.println("Value of y: "+y);

        char c = 'a';
        System.out.println(c+c);//97+97=194(called as implicit type casting)=> ?
        System.out.println((char)(c+c));//194 converted to char=Â(explicit type casting)
        System.out.println(c*1);//97*1=97
        System.out.println(0+c);//97+0=97
        System.out.println(c*3.0);//97*3.0=291.0


        int n = 'A';
        char m = (char) n;   // explicit type casting
        System.out.println(n);
        System.out.println(m);

    }
}
