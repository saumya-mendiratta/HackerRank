package Algorithm;

public class CamelCase {

	public static void main(String[] args) {
		
		int n= camelcase("oneTwoThree");
		System.out.println(n);
	}

	public static int camelcase(String s) {
		
	        int terms = 1;
	        for (int i = 0; i < s.length(); i++) {
	      
	            String letter = Character.toString(s.charAt(i));
	            if (letter == letter.toUpperCase()) {
	                terms++;
	            }
	        }
	        return terms;
	}
}
