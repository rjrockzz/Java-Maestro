import java.util.Scanner;
public class NestedMethods
{
    int perimeter(int l, int b)
    {
        int pm = 2 * (l+b);
        return pm;
    }
    int area(int l, int b)
    {
        int pm = perimeter(l, b);
        System.out.println(pm);
        int area = l*b;
        return area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of rectangle = ");
        int l = s.nextInt();
        System.out.println("Enter the breadth of rectangle = ");
        int b = s.nextInt();
        NestedMethods n = new NestedMethods();
        System.out.println(n.area(l,b));
    }
}