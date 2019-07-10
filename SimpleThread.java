public class SimpleThread extends Thread{
public void run()
{
    System.out.println("Thread Class");
}

    public static void main(String[] args) {
        Thread t1 = new Thread(new SimpleThread());
        t1.start();
    }
}
