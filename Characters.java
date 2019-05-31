public class Characters {
    public static void main(String[] args) {
        char ch1=  'E' , ch2, kh2, kh3;
        char kh1 = 66;
        kh2 = kh1++;
        ch2 = ch1--;
        kh3 = ++ch1;
        System.out.println("kh1 = " + kh1 + "\tch2 = " + ch2);
        System.out.println("kh2 = " + kh2 + "\tkh3 = " + kh3);
    }
}
