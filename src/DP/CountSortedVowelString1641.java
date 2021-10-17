package DP;

public class CountSortedVowelString1641 {

	public static void main(String[] args) 
	{
		
	}
	public int countVowelStrings(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=5;
        int counta = 1;int counte=1;int counti=1;int counto=1;int countu=1;
        for(int i=2;i<=n;i++) {
        	countu=dp[i-1]-counta-counte-counti-counto;counto=dp[i-1]-counta-counte-counti;counti=dp[i-1]-counta-counte;counte=dp[i-1]-counta;counta=dp[i-1];
        	dp[i] = counta+counte+counti+counto+countu;
        }
		return dp[n];
    }

}
