package BinarySearch;

import java.util.HashMap;

public class LeetCodeQuestion1346 {

	public static void main(String[] args) {
		
	}
	public boolean checkIfExist(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]*2) || (map.containsKey(arr[i]/2) && arr[i]%2==0)) {
				return true;
			}
			map.put(arr[i], 1);
		}
		return false;
    }

}
