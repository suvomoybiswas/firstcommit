package javainterview;

public class Palindrom {
	
	public static void checkP(String st) {
		
		String st1 ="";
		int l = st.length();
		
		for(int i=l-1;i>=0;i--) {
			
			st1 = st1+ st.charAt(i);
		}
		System.out.println(st1);
		
		if (st1.equalsIgnoreCase(st))
			System.out.println("paliamdrom number");
		else
			System.out.println("not paliamdrom number");
	}
	// for number
	
	public static void pallindromNo(int x) {
		
		int reversed = 0;
		while(x!=0) {
			
			int y = x/10;
			int a = x%10;
			reversed = reversed*10+a;
			x = y;
		}
		System.out.println(reversed);
		if(x==reversed)
			System.out.println("This is a palliandrom number");
		else
			System.out.println("This is a palliandrom number");
			
	}
	public static void main(String[] args) {
		
		checkP("teet");
		pallindromNo(16461);
	
		
	}
	

}
