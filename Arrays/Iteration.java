import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An Iterable implementation.
 */
public class Iteration{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.forEach(System.out::println);

    }
}
