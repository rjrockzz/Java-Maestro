public class ObjectMethodReference {
    public static void main(String[] args) {
        new Thread (ObjectMethodReference :: Method1).start();
    }
    static  void Method1()
    {
        System.out.println("Creating threads by object references");
    }
}
