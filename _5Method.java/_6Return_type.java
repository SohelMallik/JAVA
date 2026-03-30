public class _6Return_type {
    
    
    public static int cat(int b){
        if(b < 5){
            return 3;
        }
         return 6;
        //else return -6;
    }
    
    public static void main (String [] args){
        int a = 3;
        System.out.println(cat( a));
    }
}

