public class _15PassByValue {
     static void change(int x){
         x=10; // int x  Jodi Likhi (ERROR Show )
         
    } 
    
    public static void main(String [] args){
        int x=6;
        System.out.println(x);

        change(x);
        System.out.println(x);
    }
}
