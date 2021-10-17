package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class UglyNumberII264 {

	public static void main(String[] args) {
		int uglynumber = new UglyNumberII264().nthUglyNumber(1690);
		System.out.println(uglynumber);
	}
	public int nthUglyNumber(int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int num=1;
		while(true) {
			if(pq.size()>=n)
				break;
			if(UglyNumberII264.PrimeFactored(num)==1) {
				pq.add(num);
			}
			num++;
		}
		
		return pq.peek();
    }
	public static int PrimeFactored(int num) {
		while(num%2==0)num/=2;
		while(num%3==0)num/=3;
		while(num%5==0)num/=5;
		if(num==1)
			return 1;
		else
			return 0;
	}

}
