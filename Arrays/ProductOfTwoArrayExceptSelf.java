/**
 * Leetcode Logic
 */
import java.util.Arrays;
// @[ToDo]
public class ProductOfTwoArrayExceptSelf {
    public static int[] ProdArr(int[] nums){
        int size = nums.length;
        int[] result = new int[size];
        int preProd = 1;
        for (int i = 0; i < size; i++){
            result[i] = preProd;
            preProd*=nums[i];
        }
        int postProd = 1;
        for (int i = size-1; i >= 0; i--){
            result[i] = result[i]*postProd;
            postProd*=nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(ProdArr(new int[] {1,2,3,4})));
    }
}



/**
 * My Average Logic
 */
//
//import java.util.Arrays;
//
//public class ProductOfTwoArrayExceptSelf {
//    public static int[] ProdArr(int[] nums) {
//        int[] temp = new int[nums.length];
//        int size = nums.length;
//        int prod = 1;
////        System.arraycopy(nums, 0,temp,0,size);
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if (i != j) {
//                    prod *= nums[j];
//                    temp[i] = prod;
//                }
//            }
//            prod = 1;
//        }
//        return temp;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(ProdArr(new int[] {1,2,3,4})));
//    }
//}

