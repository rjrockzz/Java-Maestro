import java.util.*;


class Solution {
    public static int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) mp.put(nums[i], i);
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(target-nums[i])){
                if(mp.get(target-nums[i])!=i){
                    res[0]=i;
                    res[1] = mp.get(target-nums[i]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 5)));
    }
}