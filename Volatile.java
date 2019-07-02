public class Volatile extends Thread {
    private static volatile int v = 0;

    public static void main(String[] args) {
        Volatile vg = new Volatile();
        new Thread(() -> Method1()).start();
        new Thread(() -> Method2()).start();
    }

    public static void Method1() {
        try {
            for (int i = 1; i < 4; i++) {
                v += 5;
                System.out.println("Integer Set = " +v);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void Method2()
    {
        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Integer Read = " +v);
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}