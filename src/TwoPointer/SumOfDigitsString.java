package TwoPointer;

import java.util.ArrayList;

public class SumOfDigitsString {

	public static void main(String[] args) {
		int ans = new SumOfDigitsString().getLucky("dbvmfhnttvr",5);
		System.out.println(ans);
	}
	public int getLucky(String s, int k) 
	{
		char[] arr = s.toCharArray();
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]-96);
		}
		while(k-->0) {
			
		}
		return 0;
    }
	public int returnSum(ArrayList<Integer> li) {
		int sum=0;
		for(int i:li)
			sum+=i;
		return sum;
	}
	

}
