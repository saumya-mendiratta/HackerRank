package Algorithm;

import java.util.HashMap;

public class Ice_cream_parlour {

	public static void main(String[] args) {

	}

	static int[] icecreamParlor(int m, int[] arr) {

		int i = 0, j = 1;
		int n = arr.length;
		int[] a = new int[2];
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == m && i != j) {
					// System.out.println(i+1+" " + j+1);
					a[0] = i + 1;
					a[1] = j + 1;
					// System.out.println();
				}

			}
		}

		return a;
	}

	static int[] icecreamParlorMap(int m, int[] arr) {

		int n = arr.length;
		int[] a = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			int X = arr[i];
			int Y = m - X;

			if (map.get(Y) != null) {

				a[0] = map.get(Y) + 1;
				a[1] = i + 1;

			}

			map.put(X, i);
		}

		return a;
	}
}
