class Outer
{
    private double length;
    private double width;
    Outer(double x, double y)
    {
        length = x;
        width = y;
    }
    double area()
    {
        return length * width;
    }
    void displayOuter() {
        Inner iner = new Inner();
        iner.displayInner();
    }class Inner
{
    double rate = 20.5;
    double perimeter = 2 * (length + width);
    double fencingCost = rate * perimeter;
    void displayInner(){
        System.out.println(fencingCost);
    }

}
}
public class NestedClass {
    public static void main(String[] args) {
        Outer obj = new Outer(40,60);
        obj.displayOuter();
        System.out.println(obj.area());
    }
}
