import java.util.Scanner;
public class FactClass {
    int fact(int k) {
        if (k == 0||k==1) {return 1;
        } else
            return k* fact(k - 1);
    }
    public static void main(String[] args) {
        FactClass f1 = new FactClass();
        System.out.println("Enter the number = ");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println(f1.fact(n));
    }
}