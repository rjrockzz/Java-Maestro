/*
Leetcode approach O(n)
 */
public class MaxProdSubArray {
    public static int maxProduct(int[] nums) {
        // greedy
        // dp?
        // each index we can determine if want to include in the continious sub product up to i-th idx
        // if the product up to the current idx < value of current index
        // meaning the product is negative => but that does not mean we can throw that value away
        // as the value we could hit =>-1 at later point which convert the value to positve
        // hence we can not apply the same logic we had before
        // ie: -3 9 -1
        // try brute force => we try all possible i-j and compare their value
        // product = a * b
        // can be prefix product and sufix product
        // two smallest negative product we can find up to prefix and subfix where subfix will just be nums[i]
        // two largest positive product we can find up to prefix and subfix where subfix will be just nums[i]
        // another possible value will be just start counting from the current index i
        // max of those result => the max sub array product that contains index i
        // is above correct ? but how to compute negative prouct up to i-th
        // how to compute posivitive product up to i-th
        //   2  3  -2  4
        // p 2  6  -2  4
        // n 2  3  -12 -48
        //   2
        // pmax[i] = max(pmax[i-1] * nums[i], nums[i],  pmin[i] * nums[i]);
        // pmin[i] = min(pmax[i-1] * nums[i], nums[i],  pmin[i] * nums[i]);
        // for each step we want to record the max(pmax[i],pmin[i]);
        // -2, 2, -3
        // -2  2  12
        // -2 -4  -6
        // -2
        // we only need the previous element
        // [-4,-3,-2]
        //  -4 12, 6
        //  -4 -3,-24
        int n = nums.length;
        if (n == 1) return nums[0];
        int pmax = nums[0];
        int pmin = nums[0];
        int maxV = pmax;
        for(int i = 1; i < n; i++) {
            int pmaxTemp = Math.max(pmax * nums[i], Math.max(nums[i], pmin*nums[i]));
            int pminTemp = Math.min(pmax * nums[i], Math.min(nums[i], pmin*nums[i]));
            maxV = Math.max(pmaxTemp, maxV);
            pmax = pmaxTemp;
            pmin = pminTemp;
        }
        return maxV;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,4,-1,-9,1,-8,3}));
    }
}

/*
Actually is a DP question.
 */
/*
The Brute Force Approach I Know ... which has flaws too :(
 */
//public class MaxProdSubArray {
//    public static int ProdArr(int[] nums){
//        int size = nums.length;
//        int max_prod = nums[0];
//        int cur_prod = 1;
//        for(int i = 0; i < size-1; i++){
//            cur_prod = nums[i]*nums[i+1];
//            for(int j = i + 1; j <= size-1; j++){
//                max_prod = Math.max(max_prod,cur_prod);
//                try{
//                    cur_prod = cur_prod*nums[j+1];
//                }catch(ArrayIndexOutOfBoundsException e){
//                    return max_prod;
//                }
//            }
//        }
//        return max_prod;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(ProdArr(new int[]{2,3,4,-1,-9,1,-8,3}));
//    }
//}
