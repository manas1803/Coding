package DP;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegersbyThePowerValue1387 {

	public static void main(String[] args) {
		int res = new SortIntegersbyThePowerValue1387().getKth(12,13,2);
		System.out.println(res);
	}
	static int[] dp = new int[1001];
	public int getKth(int lo, int hi, int k) {
		ArrayList<Data> al = new ArrayList<Data>();
		for(int i=lo;i<=hi;i++) {
			int power = getValues(i);
			al.add(new Data(power,i));
		}
		Collections.sort(al,(a,b)->{
			return a.power-b.power;
		});
		return al.get(k-1).value;
    }
	public int getValues(int n) {
		int count=0;
		if(dp[n]!=0)
			return dp[n];
		if(n==1 || n==2)
			return 1;
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				count++;
			}
			else {
				n= (3*n) + 1;
				count++;
			}
		}
		return dp[n]=count;
	}

}
class Data{
	int power;
	int value;
	public Data(int power,int value) {
		this.power = power;
		this.value=value;
	}
}
