package Array;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAvgSubArray643 {

	public static void main(String[] args) {
		int[] nums = {0,4,0,3,2};
		double ans = new MaxAvgSubArray643().findMaxAverage(nums,1);
		System.out.println(ans);
	}
	public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		double avg=0;
		for(int i=0;i<k;i++) {
			sum+=nums[i];
		}
		avg=sum;
		int i=0;
		int j=k;
		while(j<nums.length) {
			sum = sum+ nums[j]-nums[i];
			if(sum>avg)
				avg = sum;
			i++;
			j++;
		}
		return avg/k;
    }

}
