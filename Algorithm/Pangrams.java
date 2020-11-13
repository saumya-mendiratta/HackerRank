package Algorithm;

import java.util.HashMap;

public class Pangrams {

	public static void main(String[] args) {
		
		System.out.println(pangrams("The quick brown fox jumps over the laz dog"));
	}

	public static String pangrams(String s) {

		boolean[] b = new boolean[26];

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
          
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
			int idx = s.charAt(i) - 'a';
			b[idx] = true;

			}
		}

		for (int i = 0; i <= 25; i++) {

			if (b[i] == false)
				return "not pangram";
		}

		return "pangram";
	}

}
