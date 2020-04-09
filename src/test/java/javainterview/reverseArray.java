package javainterview;

public class reverseArray {
	//Java Program to find the first duplicate occurrence in an array
	
	/*
	 * public static void getFO() { int [] a = {1,2,3,5,2,1,4}; for(int
	 * i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) { if (a[i]==a[j])
	 * System.out.println(a[i]); //return; break; }
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		 int [] a = {1,2,3,5,2,1,4};
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
			  if (a[i]==a[j])
				  System.out.println(a[i]); 
			  break;
			  }
		  }
			  }
		  }


