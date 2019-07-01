public class StaticMethod {
    static void show()
    {
        System.out.println("Component details of Computer");
    }
    void display()
    {
        System.out.println("Main Components");
    }
    public static void main(String[] args) {
        show();
        StaticMethod y = new StaticMethod();
        y.display();
        y.show();
    }
}
