import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class ArrayListDetailed {
    public static void main(String[] args) {
        String[] word = {"He", "is", "cool"};
        System.out.println("1. Creating empty list of strings.");
        List<String> strlist = new ArrayList<>();
        printListWithIndex(strlist);

        System.out.println("2. Add elements in list. ");
        for (String str : word) {
            strlist.add(str);
            printListWithIndex(strlist);
        }
        System.out.println("3. Insert element at index 2 ");
        strlist.add(2, "java");
        printListWithIndex(strlist);

        System.out.println("\n4. Replace at index 1");
        String old = strlist.set(1, "Naan");
        System.out.println("Item replace = " + old);
        printListWithIndex(strlist);

        System.out.println("5. Remove at index 0 ");
        System.out.println("Element remove: " + strlist.remove(0));
        printListWithIndex(strlist);

        System.out.println("6. Remove the first occurrence of java");
        System.out.println("Element removed = " + strlist.remove("java"));
        printListWithIndex(strlist);

        System.out.println("7. Size of list = ");
        System.out.println(strlist.size());

        System.out.println("8. Determine if the list is empty = ");
        boolean result = strlist.isEmpty();
        System.out.println(result);

        System.out.println("9. Element at last index = ");
        System.out.println(strlist.get(strlist.size() - 1));

        System.out.println("10. Lists are equal or not = ");
        System.out.println(word.equals(strlist));

        System.out.println("11. Membership = ");
        boolean found = strlist.contains("Naan");
        System.out.println(found);

        System.out.println("12. Index of elements : ");
        System.out.println(strlist.lastIndexOf("Naan"));

        System.out.println("13. Traversing : ");
        for (String str : strlist)
            System.out.println(str + " ");

        System.out.println("14. List to Array : ");
        Object[] objArray = strlist.toArray();
        System.out.println("Length of object array = " + objArray.length);
        System.out.println("Length of each string in the array : ");
        for (Object obj : objArray) {
            String str = (String) obj;
            System.out.println("Length of String = " + str.length());
        }

        System.out.println("15. Sorting a list : ");
        Collections.sort(strlist);
        System.out.println(strlist);
    }
    public static <E> void printListWithIndex(List<E> list){
        List<String> newList = new ArrayList<>();
        for(int i = 0; i<list.size(); i++)
        {
            newList.add(i + ":" +list.get(i));
        }
        System.out.println(newList);
    }
}