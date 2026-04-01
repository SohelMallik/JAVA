public class _11StaticVsInstance {
  
    public void show() {
        System.out.println("instance");
    }

    public static void show(int a) {
        System.out.println("static");
    }

    public static void main(String[] args) {
        _11StaticVsInstance obj = new _11StaticVsInstance();
        obj.show();
        obj.show(10);
    }
}

