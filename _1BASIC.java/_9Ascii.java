public class _9Ascii {
    public static void main(String[] args) {

        char ch1= 'A';
        int x= ch1; // implicit type casting (smaller to larger data type)
        System.out.println("The ASCII value of "+ch1+" is: "+x);

        int y= 66;
        char ch2= (char) y; // explicit type casting(larger to smaller data type)
        System.out.print("\nThe character value of "+y+" is: "+ch2);

        int  f= 67;
        double s=(double) f;// explicit type casting
        System.out.print('\n'+"The ASCII value of "+f+" is: "+s);

        int z = 8;
        double p=  z;// implicit type casting
        System.out.println("\nThe character value of "+z+" is: "+p);

    }
}