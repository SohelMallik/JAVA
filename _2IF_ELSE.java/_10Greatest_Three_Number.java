import java.util.Scanner;
public class _10Greatest_Three_Number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a=sc.nextInt();

        System.out.print("Enter second number:");
        int b=sc.nextInt();

        System.out.print("Enter third number:");
        int c=sc.nextInt();

        String result = (a>=b) ?((a>=c) ? "a": "c") :((b>=c) ? "b": "c");
        System.out.println("The greatest number is: " + result);


        // if(a>=b && a>=c){
        //     System.out.println(a+" is Greater");
        // }else{
        //     if (b>=a && b>=c){
        //         System.out.println(b+" is Greater");
        //     }else{
        //         System.out.println(c+ " is Greater");
        //     }
        // }

        
        // if (a>b){// b is not greatest
        //     if (a>c){// 
        //         System.out.println(a+" is the greatest number");
        //     } else {// c>a
        //         System.out.println(c+" is the greatest number");
        //     }
        // } else {// b>a
        //     if (b>c){
        //         System.out.println(b+" is the greatest number");
        //     } else {// c>b
        //         System.out.println(c+" is the greatest number");
        //     }
        // }
        
        sc.close();
    }
    
}
