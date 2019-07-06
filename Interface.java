interface SurfaceArea{
    double Compute(double x);
}
class Square implements  SurfaceArea
{
    @Override
    public double Compute(double x) {
        return x*x;
    }
}
class Circles implements SurfaceArea
{
    @Override
    public double Compute(double x) {
        return 3.14*x*x;
    }
}
public class Interface {
    public static void main(String[] args) {
        Circles cir = new Circles();
        Square sqr = new Square();
        System.out.println("The area of Circle is = " + cir.Compute(2.0));
        System.out.println("The area of Square is = " + sqr.Compute(2.0));
    }
}

