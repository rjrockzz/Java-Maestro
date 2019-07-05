public class MutliDimensionalArray {
    public static void main(String[] args) {
        double [][] arr1 =  {{1,2,3},{4,5,6},{7,8,9}};
        double [][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
        double [][] pow = new double[3][3];
        for(int i = 0; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr1[i].length ; j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i = 0; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr1[i].length ; j++)
            {
                pow[i][j] = Math.pow(arr[i][j], 2)+ Math.pow(arr1[i][j] , 2) ;
            }
        }
        for(double[] x : pow) {
            for (double y : x) {
                System.out.println(x + " ");
            }
        }
    }
}
