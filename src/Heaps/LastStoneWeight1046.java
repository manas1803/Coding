package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {

	public static void main(String[] args) {
		int[] nums = {2,12,3,4,7,9,100};
		int res = new LastStoneWeight1046().lastStoneWeight(nums);
		System.out.println(res);
	}
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<stones.length;i++) {
			pq.add(stones[i]);
		}
		while(pq.size()>1) {
			int num1 = pq.poll();
			int num2 = pq.poll();
			int res = num1-num2;
			if(res!=0) {
				pq.add(res);
			}
		}
		if(pq.isEmpty())
			return 0;
		else
			return pq.peek();
    }

}
