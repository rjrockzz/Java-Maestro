import java.util.Arrays;
public class SortingNSearching {
    public static void main(String[] args)
    {
        int intArr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(intArr);
        System.out.println("Integer Array as List: "
                + Arrays.binarySearch(intArr , 35));
    }
}
