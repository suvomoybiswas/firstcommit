package javainterview;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		
		  int a[] = {34,54,67,-23,45,-25,3554};
		  
		  int larg = a[0]; int small = a[0];
		  
		  for(int i=1;i<a.length;i++) {
		  
		  if(a[i]>larg) { larg = a[i]; }
		  
		  else if (a[i]<small) { small = a[i]; } }
		  
		  System.out.println("largest::" + larg); System.out.println("small::" +
		  small);
		 
		
		
		
	}

}
