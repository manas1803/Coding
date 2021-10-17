package DP;

public class MaximumSubArray53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] a) {
		int mainMax=a[0];
		int currMax = a[0];
		
		for(int i=1;i<a.length;i++) {
			currMax = Math.max(currMax, currMax+a[i]);
			mainMax = Math.max(currMax, mainMax);
		}
		return mainMax;
    }
}
