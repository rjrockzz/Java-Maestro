import java.lang.*;
public class CommandLineArgument {
    static int b = 0;        
    public static void main(String[] args) {
    	int a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a=a+2;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(b);
            b=b+2;
        }
    }
}