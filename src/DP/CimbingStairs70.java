package DP;

public class CimbingStairs70 {

	public static void main(String[] args) {
	}
	public int climbStairs(int n) 
	{
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++) {
			if(i==1)
				dp[1]=1;
			else if(i==2)
				dp[2]=2;
			else
				dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
    }

}
