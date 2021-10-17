package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MinimumIndexSumOfTwo {

	public static void main(String[] args) 
	{
//		int a[][] = { { 1, 2, 3, 4, 5, 6 },
//                { 7, 8, 9, 10, 11, 12 },
//                { 13, 14, 15, 16, 17, 18 } };
//		//List<Integer> al = new MinimumIndexSumOfTwo().spiralOrder(a);
//		
////		for(int i:al) {
////			System.out.print(i + " ");
////		}
//		System.out.println();
//		int b[][] = new MinimumIndexSumOfTwo().generateMatrix(3);
//		
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<b[0].length;j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		int[] a = {3, 30, 34, 5, 9};
//		String result = new MinimumIndexSumOfTwo().largestNumber(a);
//		System.out.println(result);
		
//		int[] a = {1, 2, 3};
//		int[] res =  new MinimumIndexSumOfTwo().plusOne(a);
//		System.out.println(res);
		int precision = 5;
		double res = new MinimumIndexSumOfTwo().sqrt(10,precision);
		System.out.println(String.format("%.5f",res));
		
	}
	public int[] spiralOrder(int[][] matrix) {
		int row = matrix.length;
        int col = matrix[0].length;
        int startRow=0;
        int startColumn=0;
        ArrayList<Integer> li = new ArrayList<Integer>();
        
        while(startRow<row && startColumn<col) {
        	for(int i=startColumn;i<col;i++) {
        		li.add(matrix[startRow][i]);
        	}
        	startRow++;
        	
        	for(int i=startRow;i<row;i++) {
        		li.add(matrix[i][col-1]);
        	}
        	col--;
        	
        	if(startRow<row) {
        		for(int i=col-1;i>=startColumn;i--) {
        			li.add(matrix[row-1][i]);
        		}
        		row--;
        	}
        	if(startColumn<col) {
        		for(int i=row-1;i>=startRow;i--) {
        			li.add(matrix[i][startColumn]);
        		}
        		startColumn++;
        	}
        }
        int[] result = new int[li.size()];
        for(int i=0;i<result.length;i++) {
        	result[i]=li.get(i);
        }
        return result;
    }
	public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int rowStart = 0;
        int columnStart=0;
        int rowEnd=n;
        int columnEnd=n;
        int insertnum = 1;
        while(rowStart<rowEnd && columnStart<columnEnd) {
        	for(int i=columnStart;i<columnEnd;i++) {
        		answer[rowStart][i]=insertnum;
        		insertnum++;
        	}
        	rowStart++;
        	
        	for(int i=rowStart;i<rowEnd;i++) {
        		answer[i][columnEnd-1] = insertnum;
        		insertnum++;
        	}
        	columnEnd--;
        	
        	if(rowStart<rowEnd) {
        		for(int i=columnEnd-1;i>=columnStart;i--) {
            		answer[rowEnd-1][i] = insertnum;
            		insertnum++;
            	}
            	rowEnd--;
        	}
        	
        	if(columnStart<columnEnd) {
        		for(int i=rowEnd-1;i>=rowStart;i--) {
            		answer[i][columnStart] = insertnum;
            		insertnum++;
            	}
            	columnStart++;
        	}
        }
        return answer;
    }
	public String largestNumber(final int[] A)
	{
		StringBuilder sb = new StringBuilder();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<A.length;i++) {
			al.add(A[i]+"");
		}
		Collections.sort(al, new Comparator<String>() {
			@Override public int compare(String X, String Y) 
			{
				String XY = X+Y;
				String YX = Y+X;
				return XY.compareTo(YX)>0?-1:1;
			}
		});
		Iterator it = al.iterator();
		while(it.hasNext()) {
			sb = sb.append(it.next());
		}
		if(al.get(0).equals("0")) {
			return "0";
		}
		else
		return sb.toString();
    }
	public int[] plusOne(int[] A) 
    {
		ArrayList<Integer> al = new ArrayList<Integer>();
        int carry=1;
        int sum = 0;
        for(int i=A.length-1;i>=0;i--) {
        	sum = A[i]+carry;
        	if(sum>9) {
        		carry=sum/10;
        		sum%=10;
        	}
        	else {
        		carry=0;
        	}
        	al.add(sum);
        }
        if(carry!=0)
        	al.add(carry);
        Collections.reverse(al);
        int x=0;
        while(x<al.size()) {
        	if(al.get(x)!=0) {
            	break;
            }
        	else {
        		al.remove(x);
        	}
        }
        int[] arr = new int[al.size()];
        for(int i=0;i<arr.length;i++) {
        	arr[i] = al.get(i);
        }
        return arr;
    }
	public int trailingZeroes(int A) 
    {
		int res = 0;
		int i=1;
		while((int)(A/(Math.pow(5, i)))!=0) {
			res = res + (int)(A/(Math.pow(5, i)));
			i++;
		}
        return res;
    }
	public double sqrt(int A,int prec) 
	{
		long start=0;
		long end = A;
		double res = 0.0;
		while(start<=end) {
			long mid = start + (end-start)/2;
			if(mid*mid==A) {
				res = mid;
				break;
			}
			else if(mid*mid<A) {
				start=mid+1;
				res = mid;
			}
			else {
				end=mid-1;
			}
		}
		double increment = 0.1;
		for(int i=0;i<prec;i++) {
			while(res*res<=A) {
				res+=increment;
			}
			res=res-increment;
			increment=increment/10;
		}
		return (float)res;
    }
}
