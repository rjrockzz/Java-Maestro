public class PrintfFormat {
    public static void main(String[] args) {
        int n = 321;
        float x = 45.654f;
        double dbl = 56.432;
        String str = "Arjun";
        char ch = 'A';
        System.out.printf("%d %2.4f %2.3f %C %c\t%s\t%S\n",n,x,dbl,ch,ch,str,str);
        System.out.printf("%X\t", 163);   //Hexadecimal
        System.out.printf("%o", 163);     //Octal
        System.out.printf("\t %b %B",5<4,5>2);
        System.out.printf("\n%b", null);

    }
}
