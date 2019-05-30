import java.util.Scanner;
public class DectoHex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n;
        System.out.print("Enter the Decimal = ");
        n = scan.nextInt();
        int bin[] = new int[32];
        for(int i = 0; i<32 ; i++) {
            bin[31 - i] = 16 *(n % 16);
            if(bin[31-i]==10)
                System.out.print("A");
            if(bin[31-i]==11)
                System.out.print("B");
            if(bin[31-i]==12)
                System.out.print("C");
            if(bin[31-i]==13)
                System.out.print("D");
            if(bin[31-i]==14)
                System.out.print("E");
            if(bin[31-i]==15)
                System.out.print("F");
            System.out.print(bin[i]);
            n = n / 16;
        }
        System.out.println();
    }
}
