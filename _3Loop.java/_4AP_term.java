/* Display AP-  2,5,8,11,...,n term */



public class _4AP_term {
    public static void main(String[] args) {
        int n;
        java.util.Scanner so=new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        n=so.nextInt();

        for (int i = 1; i <=n; i+=1) {
            System.out.println(3*i-1);
        }
        // for (int i = 2; i <=3*n-1; i+=3) {
        //     System.out.println(i);
        // }
        so.close();
    }
}
