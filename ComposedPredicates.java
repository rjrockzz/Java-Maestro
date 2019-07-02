import java.util.function.*;
public class ComposedPredicates {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (i) -> i > 20;
        Predicate<Integer> predicate2 = (i) -> i < 80;
        boolean b = predicate1.and(predicate2).test(50);
        System.out.println(b);
    }
}
