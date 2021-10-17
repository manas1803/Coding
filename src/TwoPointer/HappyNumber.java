package TwoPointer;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		
	}
	public int getSquaredNumber(int n) {
		int[] squared = new int[10];
		int ret = 0;
		for(int i=0;i<squared.length;i++) {
			squared[i] = i*i;
		}
		while(n>0) {
			int rem = n%10;
			ret += squared[rem];
			n/=10;
		}
		return ret;
	}
	public boolean isHappy(int n) {
		HashSet<Integer> hs = new HashSet<>();
		while(n!=1 && n>0) {
			n = getSquaredNumber(n);
			if(hs.contains(n)) return false;
			hs.add(n);
		}
		return true;
    }

}
