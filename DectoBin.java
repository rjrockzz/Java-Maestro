import java.util.Scanner;
public class DectoBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the Decimal = ");
        n = scan.nextInt();
        int bin[] = new int[32];
        for(int i = 0; i<32 ; i++) {
            bin[31 - i] = n % 2;
            System.out.print(bin[i]);
            n = n / 2;
        }
        System.out.println();
    }
}
