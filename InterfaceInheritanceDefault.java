interface A {
    default public void display()
    {
        System.out.println("This is A interface.");
    }
    int area (int x);
}
interface  B extends A
{
    default public void display()
    {
        System.out.println("This is B interface.");
    }
    static int major(int x)
    {
        return x*x;
    }
}
public class InterfaceInheritanceDefault implements B{
    public int area(int x)
    {
        return x*x;
    }

    public static void main(String[] args) {
        InterfaceInheritanceDefault def = new InterfaceInheritanceDefault();
        def.display();
        def.area(3);
    }
}
