package javainterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;


public class AdvanceInterview {

	public static void main(String[] args) {
		
		AdvanceInterview a = new AdvanceInterview ();
		//a.sortHashkeys();
		//a.swapList();
		//a.getDuplicate();
		//a.findNonRN();
		//a.removeElement();
		//a.findSimilarity();
		//a.randomNumber();
		//a.bubbleSort();
		//a.reverseWord();
		//a.anagram();
		//a.coutOccurance();
		//a.getLength("suvobiswas");
		
	}
	//How to sort hashmap keys in java?
	
	public void sortHashkeys() {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(8, "dhaka");
		map.put(3, "dhak");
		map.put(5, "dhaa");
		map.put(7, "dhka");
		map.put(2, "daka");
		//if we want to have natural sorting order of keys then the following way is easiest
		String s=map.toString();
		System.out.println(s);
		// sorting in reverse way
		StringBuffer sb = new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
	}

//How to swap elements in list in java?
  public void swapList() {
	  List<Integer> l = new ArrayList<>();
	  l.add(19);
	  l.add(13);
	  l.add(13);
	  l.add(43);
	  l.add(2);
	  System.out.println("before swap:: "+l);
	  
	  //Collections.addAll(l, 2,3,4);
	  //Collections.swap(l, 1, 4);
	  System.out.println("After swap:: "+l);
  }
//Write a java program to check whether array contains duplicates
 public void getDuplicate() {
	 int dup=0;
	 int [] a = {23,4,5,3,3,54,23};
	 for(int i=0;i<a.length;i++) {
		 for(int k=i+1;k<a.length;k++) {
			 if(a[i]==a[k]) {
				 dup = a[k]; 
				// System.out.println(dup);
			 }
				 
		 }
	 } 
 }

 //Write a java program to find first non repeated character in String in java?	
 
 public void findNonRN() {
	 String s = "suvoboswas";
	// "suvoboswas".charAt(index)
	char [] a=s.toCharArray();
	
	Map<Character,Integer> m = new LinkedHashMap<>();
	for(char a1:a) {
		m.put(a1, m.containsKey(a1)? m.get(a1)+1:1);
	}
	for(Entry<Character,Integer> e : m.entrySet()) {
		if (e.getValue()==1) {
		char  nonrep= e.getKey();
		System.out.println("Nonrepeating characters::"+nonrep);
		}
		
	}
 }
 //Remove an Element at specific index from an Array in Java	 
		 public void removeElement() {
			 int[] a = {1,5,3,6,8};
			 
			 int [] b = new int[a.length-1];
			 int index=2;
			 
			 for(int i=0,k=0;i<a.length;i++) {
				 if(i==index) {
					 continue;
				 }
				b[k++]=a[i];
			 } 
			 System.out.println("New Array::"+Arrays.toString(b));
		 }
		 

		// Program to check whether an element is present in two arrays in given 3 arrays
		 public void findSimilarity() {
			 
			 Integer [] a1 = {3,4,5,6,6,33};
			 Integer [] a2 = {54,4,22,6,66,67};
			 Integer [] a3= {3,4,87,65,55,33};
			 
			 HashSet<Integer> h = new HashSet<>();
			 List<Integer> l1 = Arrays.asList(a1);
			 List<Integer> l2 = Arrays.asList(a2);
			 List<Integer> l3 = Arrays.asList(a3);
			 h.addAll(l1);
			 h.addAll(l2);
			 h.addAll(l3);
			 List<Integer> common = new ArrayList<>();
			 for(Integer sn:h) {
				 
				 if((l1.contains(sn) && l2.contains(sn)) || (l1.contains(sn) && l3.contains(sn)) || (l2.contains(sn) && l3.contains(sn))) {
					 common.add(sn);
				 }
			 }
			 
			 System.out.println("Present at least two arrays==> "+common);
			 
		 }

		 public void randomNumber() {
			 
			 Random r = new Random();
			int x = r.nextInt(100);
		
			System.out.println(x);
			 
		 }
		 
		 public void bubbleSort() {
			 
			 int [] a = {3,4,2,5,6};
			 System.out.println("before sorting==> " +Arrays.toString(a));
			 for(int i=0;i<a.length-1;i++) {
				 for(int j=0;j<a.length-1;j++) {
					 if(a[j]>a[j+1]) {
						int temp= a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					 }
				 }
			 }
			 System.out.println("After bubble sort==> "+Arrays.toString(a));
		 }
		 //How To Reverse Each Word in a String
		 public void reverseWord() {
			 
			 String s = "My name is suvo";
			 StringBuffer s1 = new StringBuffer(s);
			s1= s1.reverse();
			System.out.println(s1);
			 
		 }
		 
		 public void anagram() {
			 
			 String s = "now";
			 String s1 = "oan";
			 
			 int count=0;
			 for(int i=0;i<s.length();i++) {
				 for(int j=0;j<s1.length();j++) {
					 if (s.charAt(i)==s1.charAt(j)) {
						 count++;
					 }
				 }
				 
			 }
			 
			 if(count==s1.length())
				 System.out.println("It is an anagram");
			 else
				 System.out.println("It is not an anagram");
				 
			 
		 }
		 
	public void coutOccurance() {
		
		String s = "java anagran";
	char [] a=s.toCharArray();	
	
		Map<Character, Integer> m = new HashMap<>();
		for(char a1:a) {
		if(m.containsKey(a1)) {
			m.put(a1, m.get(a1)+1);
		
		}
		else {
			m.put(a1, 1);
		}
	}
	System.out.println(m);	 
	

	} 
	//Length Of The String Without Using Java Built In Length Method	 
	public void getLength(String s) {
		int x;
		int y=0;
		try {
		for(int i =0;i>=0;i++) {
			s.charAt(i);
			y++;
			}}
		catch (Exception e) {
			System.out.println("length is");
			
		}
		System.out.println(y);	
		}
		
	
	
	
	
	
	
  }

