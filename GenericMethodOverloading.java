public class GenericMethodOverloading {
    public static void main(String[] args) {
        gmethod(20, 10.7f);
        gmethod(2.5 , "Arjun Sharma");
    }
    public static <T> void gmethod(T t , Float f)
    {
        System.out.println(t+"  "+f);
    }
    public static <T> void gmethod(T t , String s)
    {
        System.out.println(t+"  "+s);
    }
}
