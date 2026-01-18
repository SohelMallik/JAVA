public class _3Print_Odd_IfElse {
    public static void main(String[] args) {
        java.util.Scanner so=new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=so.nextInt();

        for (int i = 0; i <= n; i+=1) {
           System.out.println(2*i+1);
        }
        so.close();
    }
}
