package javainterview;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		
		for (int i =0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		int sum1 = 0;
		
		for (int j=0;j<=10;j++) {
			
			sum1 = sum1 + j;
		}

		int m = sum1 - sum;
		System.out.println("missing number is::" + m);
	}

}
