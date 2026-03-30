

import java.util.*;

public class _1ReturnTypeExample {

    public static void names(String name) {  // parameter name fixed
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();  // input

        names(name);  // method call

        sc.close();
    }
}
