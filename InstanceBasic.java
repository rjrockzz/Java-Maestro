class farm{
    double lentgh , width;
    double area()
    {
        return lentgh*width;
    }
    public void set (double a, double b)
    {
        lentgh = a;
        width = b;
    }
}
public class InstanceBasic {
    public static void main(String[] args) {
        farm f1 = new farm();
        farm f2 = new farm();
        f1.set(2,3);
        System.out.println(f1.area());
        f2.set(5,6);
        System.out.println(f2.area());
    }
}
