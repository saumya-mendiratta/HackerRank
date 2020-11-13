package Algorithm;

public class Palindrome_index {

	public static void main(String[] args) {

	   System.out.println(palindromeIndex("abcd"));

	}

	public static int palindromeIndex(String s) {

		if(IsPalindrom(s))
			return -1;
		
		int ans = -1;
		for (int i = 0; i < s.length(); i++) {

			String str = s.substring(0, i) + s.substring(i + 1, s.length());
			// System.out.println(str);
			if (IsPalindrom(str)) {
				ans = i;
				break;

			}
		}

		return ans;
	}

	public static boolean IsPalindrom(String s) {

		for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {

			if (s.charAt(i) != s.charAt(j))
				return false;
		}

		return true;
	}
}
