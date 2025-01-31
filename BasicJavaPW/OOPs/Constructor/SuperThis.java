class Demon {
    private int a;
    private int b;

    public Demon(){
        this(10,25);
        System.out.println("ZEro parameter");
    }
    public Demon(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void dis() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class SuperThis {
    public static void main(String[] args) {
        // Demon dp = new Demon(5, 10);
        Demon dp1 = new Demon();
        // dp.dis();
        dp1.dis();
    }
}
