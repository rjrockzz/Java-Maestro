class arjun
{
    double length, width;
    arjun(double a , double b){
        length = a;
        width = b;
    }
    public double mult()
    {
        return length*width;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        arjun a = new arjun(23, 100);
        System.out.println(a.mult());
    }
}
