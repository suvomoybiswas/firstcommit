package javainterview;

public class ReverseString {

	public static void main(String[] args) {
		
		String st = "suvomoy";
		
		int l = st.length();
		
		System.out.println(l);
		String rev = "";
		
		for (int i= l-1;i>=0; i--) {
			
			rev = rev + st.charAt(i);
		}
		
		System.out.println(rev);
		
		//second way
		
		StringBuffer sb = new StringBuffer(st);
		
		System.out.println(sb.reverse());
		// Reversing of number
		long lo = 1234232552;
		
		System.out.println(new StringBuffer(String.valueOf(lo)).reverse());
	}

}
