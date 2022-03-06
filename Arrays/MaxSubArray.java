/*
Sliding Window Solution
 */
public class MaxSubArray {
    public static int MaxSub(int[] nums){
        if(nums.length == 0) return 0;
        int curMax = nums[0], curSum = 0;
        for(int num : nums){
            curSum = Math.max(num,num+curSum);
            curMax = Math.max(curMax, curSum);
        }
        return curMax;
    }

    public static void main(String[] args) {
        System.out.println(MaxSub(new int[]{1}));
    }
}
