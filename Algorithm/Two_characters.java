package Algorithm;

import java.util.ArrayList;
import java.util.HashSet;

public class Two_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(alternate("beabeefeab"));
	}

	public static int alternate(String s) {

		int len = s.length();
		HashSet<Character> set = new HashSet();

		for (int i = 0; i < len; i++) {

			if (!set.contains(s.charAt(i)))
				set.add(s.charAt(i));
		}

		//System.out.println(set);

		Object[] arr = set.toArray();

		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// System.out.println(arr[i] + " " + arr[j]);

				Object c1 = arr[i];
				Object c2 = arr[j];

				String str = "";
				for (int k = 0; k < len; k++) {

					if (s.charAt(k) == (char) c1 || s.charAt(k) == (char) c2) {

						str += s.charAt(k);

					}

				}

				//System.out.println(str);
				if (isAlternate(str)) {
					if (str.length() > max)
						max = str.length();
				}
			}
		}

		return max;
	}

	public static boolean isAlternate(String str) {

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.charAt(i) != str.charAt(i + 2))
				return false;
		}

		if (str.charAt(0) == str.charAt(1))
			return false;

		return true;
	}
}
