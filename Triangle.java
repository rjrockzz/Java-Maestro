import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        double area,s;
        double a,b,c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        s = (a+b+c) / 2;
        System.out.println("The value of s is = " + s);
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area is = " + area);
    }
}
