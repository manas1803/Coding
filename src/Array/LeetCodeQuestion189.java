package Array;

public class LeetCodeQuestion189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k=3;
		LeetCodeQuestion189 le = new LeetCodeQuestion189();
		le.rotate(nums, k);
	}
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		k=k%len;
		int pos = len-k;
		int x=pos;
		int[] result = new int[len];
		for(int i=0;i<k;i++) {
			result[i] = nums[x];
			x++;
		}
		x=0;
		for(int i=k;i<len;i++) {
			result[i] = nums[x];
			x++;
		}
		nums = result;
    }

}
