public class DelimitingJoin {
    public static void main(String[] args) {
        String str1 = "23";
        String str2 = "7";
        String str3 = "2019";
        String str4 = String.join("/", str1, str2, str3);
        System.out.println(str4);
    }
}
