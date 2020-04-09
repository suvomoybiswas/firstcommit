package javainterview;

public class FLSNumber {

	//Write a java program to find first digit,last digit and sum of given number ?
	static int x = 12345;
	
	public static void getLast() {
		
		int last = x/10;
	    System.out.println("last digit::" + last);
		
	}
	
	public static void getFirst() {
		
		int first = x;
		while(first>=10) {
			
			first = first/10;
		}
		System.out.println(first);
		
	}
	// finding sum of a digit of a number
	
	public static void getSum() {
		int num =x;
		int sum =0;
		while(num!=0) {
			int y = num/10;
			int r = num%10;
			sum = sum+r;
			num = y;
		}
		System.out.println(sum);
	}
	// checking whether a given number is perfect square or not?
	public static void checkSquare(int s) {
		
   for (int i=0;i<=s;i++) {
	   if(i*i==s) {
		  
		   System.out.println("this is a perfect square of " +i);	
		   break; 
	   }
	   
   }
   System.out.println("false");
	}
	//Write a java program to print numbers from 1 to n using loops?
	
	public static void printNum(int n) {
		for(int i=0; i<=n;i++) {
			System.out.println(i);
		}
		
		
	}
	
	public static void main(String[] args) {
		getFirst();
		getSum();
		checkSquare(35);
		printNum(9);
		
	}

}
