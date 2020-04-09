package javainterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Miscelenious {
//Java program to count digits in an Integer
	
;	public void getDigit() {
		Integer x = 1234;
		String s = x.toString();
		System.out.println(s.length());
	}
	
	public void getDigit1() {
		int x = 1234;
		int count =0;
		while(x!=0) {
			x = x/10;
			count++;	
		}
		System.out.println(count);
	}
	
	//Write a java program to print duplicates from String in java
	public void getDuplicate() {
		String s = "javalanguage";
		char[]a=s.toCharArray() ;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(a[j]==a[i]) 
				System.out.println(a[j]);
				break;
			}
		}
	}
			//Write a java program to print floyds triangle?
			
  public void createfloyds(int n) {
	  int x=1;
	  for (int i =1;i<=n;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(x+" ");
			  x++;
		  }
		  System.out.println();
	  }					
  }	
  //How to count number of vowels in a string in java?
  public void getNVoule() {
	  String s="suvobiswas";
	  String v ="aeiou" ;
	  
	  for(int i=0;i<s.length();i++) {
		  for(int j=0;j<v.length();j++) {
			  if(v.charAt(j)==s.charAt(i)) {
				   
				  System.out.print(s.charAt(i)+" ");
			  }
			  
		  }
	  }
  }
//  Write a java program to print pyramid pattern of numbers?
  public void getPyramid(int n){
	  for(int i=0;i<=n;i++) {
		  for(int j=1;j<=n-i;j++) {
			  System.out.print(j);
		  }
		  System.out.println(" ");
	  }
  }
 // Write a java program to find missing number in array in java
  public void getMissingN() {
	  int[] a = {1,2,3,4,6};
	  int n = 6;
	   n = (n+1)*n/2;
	  int sum =0;
	  for(int i=0;i<a.length;i++) {
		  sum = sum+a[i];
	  }
	  n = n-sum;
	  System.out.println(n);
  }
 // w.a.p to print numbers in java up to10 with out using loops?
  public void printN(int n) {
	  if (n<=10)
		  System.out.println(n);
	       printN(n+1);
  }
  //How to sort elements in array in asc and desc order in java?
  public void sortAsceding() {
	
	  int[] a = {4,5,6,2,3,6,8};
	
	int temp =0;

	for (int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
			}
		}
	System.out.println(Arrays.toString(a));
	}
	  public void getFactorial(int n) {
		  int fact=1;
		  for(int i=1;i<=n;i++) {
			  fact*=i;  
		  }
		  System.out.println(fact);
	  }
	//  write a java program to find second largest element in the array in the java
	  public void getSecondHE() {
		  int a []= {3,4,8,6,5,7};
		  int max =a[0];
		  int seM =a[1];
		 for(int i=1;i<a.length;i++) {
			  
				  if(a[i]>max) {
					  max=a[i]; 
			  }	  
		  }
		 System.out.println(max);
		 for(int j=0;j<a.length;j++) {
			 if(a[j]>seM & a[j]<max) {
				 seM=a[j];
			 }
		 }
		 System.out.println("Second largest number:: " + seM);
	  }
	 // Write java program to print Characters count in each word in String ?
	  public void getCount() {
		  String s="Suvo Biswas";
		 String s1 =s.replaceAll(" ","");
		  System.out.println(s1);
		  char[] a = s.toCharArray();
		  
		  int count=0;
		  for(int i=0;i<a.length;i++) {
			  count++;
		  }
		  System.out.println(count);
	  }
	  //Write a java program to print multiplication table?
	  public void getMTable(int n) {
		  
		  for(int i=1;i<=10;i++) {
			int x=  n*i;
			  System.out.println(x);
		  }
		  
	  }
	//  Write a java program to find factors of number from 1 
	  public void getFactors(int n) {
		  int c =n;
		  int x=2,y=3,z=5,a=7;
		  
		  while(c>=2) {
			 if(c%x==0) {
				 c=c/x;
				 System.out.println(x);
			 }
			 else if (c%y==0) {
				 c=c/y;
				 System.out.println(y);
			 }
			 else if (c%z==0) {
				 c=c/z;
				 System.out.println(z);
			 }
			 else if (c%a==0) {
				 c=c/a;
				 System.out.println(a);
			 }
		  }
	  }
	
	 // Write a java program to print fibonacci series using loops?
   public static void makeFibonacci(int n) {
	   int n1 =0;
	   int n2=1;
	   for(int i=0;i<=n;i++) {
		  
			 System.out.println(n1);
			 int sum =n1+n2;
			  n2=n1;
			 n1=sum;
	   }
   }
	public static void main(String[] args) {
		
		 Miscelenious m = new  Miscelenious();
		 
		// m.getDigit();
		 //m.getDigit1();
		 //m.getDuplicate();
		// m.createfloyds(4);
		// m.getNVoule();
		// m.getPyramid(5);
		// m.getMissingN();
		 //m.printN(1);
		 //m.sortAsceding();
		// m.getFactorial(5);
		 //m.getSecondHE();
		// m.getCount();
		// m.getMTable(7);
		// m.getFactors(16);
		 m.makeFibonacci(5);
		 
	}

}
