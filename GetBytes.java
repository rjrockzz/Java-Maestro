public class GetBytes {
    public static void main(String[] args) {
        int i = 0;
        String str1 = "Arjun";
        byte arr[] = str1.getBytes();
        for (int x : arr)
        {
            System.out.printf("arr[%d] =  %d \n" , i , x);
            i++;
        }
    }
}
