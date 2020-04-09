package javainterview;

public class RemoveJunk {

	public static void main(String[] args) {
		
		// Replace by regular expression "[^a-zA-Z0-9]"
		String st = "!@#$^%$#@$ suvomoy $#%#^# biswas";
		
	st =	st.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(st);

	}

}
