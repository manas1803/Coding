package Array;

import java.util.Arrays;

public class MaximiseTheSum {

	public static void main(String[] args) {
		
	}
	public int maximumProduct(int[] nums) {
		int len = nums.length;
        Arrays.sort(nums);
        int max = 0;
        max = Math.max((nums[0]*nums[1]*nums[len-1]),(nums[len-1]*nums[len-2]*nums[len-3]));
        return max;
    }
	
}
