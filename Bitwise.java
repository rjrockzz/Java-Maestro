public class Bitwise {
    public static int d = 9, x;
    public static void main(String[] args) {
        d>>=2;      //double right shift by 2 and assign
        System.out.println(d);
        d = 9;
        d<<=1;
        System.out.println(d);
        d = 9;
        x = d>>>2;
        System.out.println(x);

    }
}
