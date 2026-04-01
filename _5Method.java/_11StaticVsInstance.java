public class _11StaticVsInstance {
  
    // public void show() { 
    //     System.out.println("instance");
    // }

    public static void show(int a) {// Sudhu parameter thakalea
        System.out.println("static");
    }

    public static void main(String[] args) {
        _11StaticVsInstance obj = new _11StaticVsInstance();
        // obj.show();
        // obj.show(10); // Error: non-static method show(int) cannot be referenced from a static context
        show(6); // Calls the static method    
    }
}

