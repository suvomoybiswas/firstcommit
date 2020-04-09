package javainterview;

public class AmstrongNumber {
	
	public static void cheekAN(int n) {
		int y = 0;
		//int t = n;
		
		while(n>0) {
			int r = n%10;
			n = n/10;
			y = y+(r*r*r);
			
		}
		System.out.println(y);
		if(n==y) {
			System.out.println("it is an amostrongnumber");
		}
	}


	public static void main(String[] args) {
		
		cheekAN(153);
	}

}
