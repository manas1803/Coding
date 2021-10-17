package TwoPointer;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3,3,4,4,4,4,5,5,5};
		int res= new RemoveDuplicates().removeDuplicates(arr);
		System.out.println(res);
	}
	public int removeDuplicates(int[] nums) {
		if(nums.length==0 || nums.length==1)
			return nums.length;
		int i=0;
		int j=1;
		for(j=1;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
    }

}
