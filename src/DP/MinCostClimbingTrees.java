package DP;

public class MinCostClimbingTrees {

	public static void main(String[] args) {
		int[] cost = {10,15,20};
		int min = new MinCostClimbingTrees().minCostClimbingStairs(cost);
		System.out.println(min);
	}
	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length];
		dp[0]=cost[0];
		dp[1]=cost[1];
		for(int i=2;i<cost.length;i++) {
			dp[i] = Math.min(cost[i]+dp[i-1], cost[i]+dp[i-2]);
		}
		return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
}
