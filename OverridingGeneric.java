public class OverridingGeneric <T> {
    T a;
    OverridingGeneric (T m)
    {
        a = m;
    }
    T getResult()
    {
        return a;
    }

    public static void main(String[] args) {
        OverridingGeneric <Integer> obj1 = new OverridingGeneric<Integer>(34);
        OverridingGeneric <Integer> obj2 = new OverridingGeneric<Integer>(88);
        System.out.println(obj1.getResult());
        System.out.println(obj2.getResult());
        }
}
class Demo2 <T> extends OverridingGeneric<T>
{
    Demo2(T m)
    {
        super(m);
    }
    T getResult()
    {
        return a;
    }
}
