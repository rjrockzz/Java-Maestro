public class StringFormatting {
    public static void main(String[] args) {
        char ch = 'B';
        String str = "This is Arjun";
        double bd = 45.89;
        System.out.printf("%s\n",str);
        System.out.printf("%.11s\n",str);           //11 characters to be displayed
        System.out.printf("|%30S|\n",str);
        System.out.printf("|%-30S|\n",str);
        System.out.printf("|%-30.6S|\n",str);
    }
}
