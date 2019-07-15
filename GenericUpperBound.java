import java.util.*;
public class GenericUpperBound {
    public static void main(String[] args) {
        Integer in;
        Double db;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer");
        in = scan.nextInt();
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Double darr[] = {1.5, 4.3, 5.5, 6.2, 9.3};
        System.out.println("Enter the double number");
        db = scan.nextDouble();
        GenericUpperBound gm = new GenericUpperBound();
        gm.search(arr, in);
        gm.search(darr, db);
    }

    public static <T extends Comparable> T search(T[] array, T in) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(in) == 0)
            {  System.out.println("At index  = " + i);
            return array[i];
        }
        else {
                System.out.println("no key");
            }
        }
        return in;
    }
}
