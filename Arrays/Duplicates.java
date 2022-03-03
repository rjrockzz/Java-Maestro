import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        int l = nums.length;

        for (int i = 0; i < l; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 1}));
    }
}
