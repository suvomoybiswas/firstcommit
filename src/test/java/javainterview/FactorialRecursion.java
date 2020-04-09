package javainterview;

public class FactorialRecursion {

	public static void getFactorial(int n) {
		 
		int fac = 1;
		
		for(int i=1; i<=n;i++) {
			
			fac = fac*i;
		}
		System.out.println(fac);
	}
	
	
	public static void main(String[] args) {
	
		getFactorial(4);
	}

}
