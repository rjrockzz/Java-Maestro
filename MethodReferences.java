import java.util.function.BinaryOperator;
public class MethodReferences {
    public static void main(String[] args) {
        BinaryOperator<Integer> maximum = Math :: max;
        System.out.println(maximum.apply(23,32));
        BinaryOperator<Double> power = Math :: pow;
        System.out.println(power.apply(2.0,3.5));
    }
}
