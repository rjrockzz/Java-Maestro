public class Array
{
    public static void main(String[] args) {
        int[] arr1, arr2;
        arr1 = new int[5];
        arr2 = new int[5];

        for (int k = 0; k < 5; k++) {
            arr1[k] = 2 * k;
            arr2[k] = 3 * k;
        }
        display(arr1);
        System.out.println();
        display(arr2);
    }
        public static void display(int arr[])
        {
            for (int y : arr)
            {
                System.out.printf( "%d\t", y);
            }
        }
}