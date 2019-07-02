public class MethodChaining
{
    public static void main(String[] args) {
        String str1 = " I live in";
        String str2 = " , India";
        str1 = str1.concat("New Delhi").concat(str2).
                replace("New", "").
                toUpperCase().concat(".");
        System.out.println(str1);
    }
}