import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        Scanner cir = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter radius = ");
        n = cir.nextInt();
        System.out.println("The circumference is = " + 2*3.14*n);
        System.out.println("The area is =" + 3.14*n*n);
    }
}