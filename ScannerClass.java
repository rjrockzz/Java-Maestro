import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner hey = new Scanner(System.in);
        Double n;
        int m;
        System.out.println("Enter A: = ");
        n = hey.nextDouble();
        System.out.println("Enetr B = ");
        m = hey.nextInt();
        System.out.println("Addition is :"+"" + (n+m));
        System.out.println("Mutliplication is :" + n*m);
    }
}
