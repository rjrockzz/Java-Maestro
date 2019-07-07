public class StringBasic {
    public static void main(String[] args) {
        String a = "arjun";
        String b = "arjun"; //String constant pool where ONLY unique Strings would exist
        String str1 =new String("arjun"); //Heap memory
        String str2 = new String ("arjun");
        System.out.println(a==b);
        System.out.println(a==str1);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}
