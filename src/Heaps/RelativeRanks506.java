package Heaps;

import java.util.PriorityQueue;


public class RelativeRanks506 {

	public static void main(String[] args) {
		int[] score = {10,3,8,9,4};
		String[] ans = new RelativeRanks506().findRelativeRanks(score);
		for(String s : ans) {
			System.out.println(s);
		}
	}
	public String[] findRelativeRanks(int[] score) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
		String[] outputArray = new String[score.length];
		
		for(int i=0;i<score.length;i++) {
			pq.add(new int[] {i,score[i]});
		}
		int rank = 1;
		
		while(pq.peek()!=null) {
			int[] element = pq.poll();
			
			switch(rank) {
			case 1:
				outputArray[element[0]]="Gold Medal";
				break;
			case 2:
				outputArray[element[0]]="Silver Medal";
				break;
			case 3:
				outputArray[element[0]]="Bronze Medal";
				break;
			default:
				outputArray[element[0]]=rank + "";
				break;
			}
			rank++;
		}
		return outputArray;
    }
}
