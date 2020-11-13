package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Hackerank_in_String {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(checkIfIsHacker(s));

	}

	private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
