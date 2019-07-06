abstract class Base{
    Base()
    {
        System.out.println("Base Man!");
    }
    abstract void arjun();
}
public class Abstract extends Base{
    void arjun()
    {
        System.out.println("Derived Man!");
    }
    Abstract()
    {
        System.out.println("Derived Constructor Man!");
    }

    public static void main(String[] args) {
        Base b = new Abstract();
    }
}
