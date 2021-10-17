package DP;

public class GetMaximuminGeneratedArray1646 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getMaximumGenerated(int n) {
		int max = Integer.MIN_VALUE;
		int[] result = new int[n+1];
		for(int i=0;i<=n;i++) {
			if(i==0)
				result[i]=0;
			else if(i==1)
				result[i]=1;
			else {
				if(i%2!=0) {
					result[i] = result[i/2]+ result[(i/2)+1];
				}
				else {
					result[i]=result[i/2] ;
				}
			}
		}
		for(int num : result) {
			if(num>=max)
				max=num;
		}
		return max;
    }

}
