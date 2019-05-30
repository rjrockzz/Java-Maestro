import java.util.Scanner;
public class Polygon {
    public static void main(String[] args) {
        int n;
        double s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sides = ");
        n = scan.nextInt();
        System.out.print("Size of eachh\b side = ");
        s = scan.nextDouble();
        double PI = 3.14159;
        double area = n*s*s / (4 * Math.tan(PI/n));
        System.out.println("Area is = " + area);
    }
}
