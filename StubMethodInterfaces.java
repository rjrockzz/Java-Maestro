interface Arjun{
    double Compute (double x);
    double Area (double x);
    void show();
}
public class StubMethodInterfaces implements Arjun{
    public double Compute(double x)
    {
        return x*x;
    }
    public double Area (double x)
    {
        return 3.13*x*x;
    }
    public void show()
    {}

    public static void main(String[] args) {
        StubMethodInterfaces stb = new StubMethodInterfaces();
        System.out.println("Compute = " + stb.Compute(3));
        System.out.println("Area = " + stb.Area(3));
    }
}
