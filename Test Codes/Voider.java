public class Voider {
    public static void main(String[] args) {
        Integer bm = new Integer(2309);
        Integer bx = new Integer(2014);
        int b1 = bm.compareTo(bx);
        System.out.println(b1);
        Character ch1 = '\n';
        Boolean ch2 = true;
        Character ch3 = new Character('A');
        System.out.println(ch1+ "  "+ ch2+ " " +ch3);
        Integer in1 = new Integer("320");
        Long in2 = new Long("87");
        Double db1 = Double.valueOf("-3.21");
        System.out.println(in1+ " "+ in2+ " "+ db1);
    }
}
