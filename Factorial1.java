import java.util.Scanner;
public class Factorial1 {
   public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        x = scan.nextInt();
        Factorial1 f = new Factorial1();
        System.out.println(f.fact(x));
    }

    public long fact(int k) {
        if (k == 1)
            return 1;
        else
            return k * fact(k - 1);
    }
}

