public class StringArray{
    public static void main(String[] args) {
        String [] arr1, arr2 ;
        arr1 = new String [] {"Hello" , "This" , "is" , "Arjun"};
        arr2 = arr1;
        display(arr1);
        display(arr2);
    }
    public static void display(String[] str)
    {
        for(String s : str)
        {
            System.out.println(s + " ");
            System.out.println();
        }
    }
}
