package Algorithm;

import java.util.HashMap;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,5,3,4,2};
		System.out.println(pairs(2, arr));
	}

	public static int pairs(int m, int[] arr) {

		int n = arr.length;
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

			int x = arr[i];
			int y = m + x;

			if (map.get(y) != null) {

				count++;

			}

			y = x - m;

			if (map.get(y) != null) {

				count++;

			}

			map.put(x, i);
		}
 
		return count;
	}
}
