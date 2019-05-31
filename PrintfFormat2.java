public class PrintfFormat2 {
    public static void main(String[] args) {
        int p = 73, m = -33;
        double z = 4533.52323523121;
        System.out.printf("%d\n",p);
        System.out.printf("|%20d|\n",p);
        System.out.printf("|%-20d|\n",p);
        System.out.printf("|%-20d|\n",-p);
        System.out.printf("|%-20d|\n",-m);
        System.out.printf("|%.2f|\n",z);
        System.out.printf("%30.2f\n",z);
        System.out.printf("|%-30E|\n",z);
        System.out.printf("|%30e|\n",z);
        System.out.printf("%-30G\n",-z);
        System.out.printf("%a\n",z);
    }
}
