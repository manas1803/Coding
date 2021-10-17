package NumberTheory;

public class AddDigits {

	public static void main(String[] args) 
	{
		int res = new AddDigits().addDigits(938);
		System.out.println(res);
	}
	public int addDigits(int num) {
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum = sum + temp;
			if(sum>=10) {
				sum = sum%10 + sum/10;
			}
			num/=10;
		}
		return sum;
    }

}
