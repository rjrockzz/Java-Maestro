import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums_merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums_merged, 0, nums1.length);
        System.arraycopy(nums2, 0, nums_merged, nums1.length, nums2.length);
        Arrays.sort(nums_merged);
        int size = nums_merged.length;
        double median = 0;
        if (size %2 ==0){
            double adder = nums_merged[(size/2) - 1] + nums_merged[(size/2)];
            median = (adder)/2;
        }
        else{
            median = nums_merged[(size)/2];
        }
        return median;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}
