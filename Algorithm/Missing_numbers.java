package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Missing_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] missingNumbers(int[] arr, int[] brr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < brr.length; i++) {

			if (map.get(brr[i]) == null) {
				map.put(brr[i], 1);
			} else {

				int val = map.get(brr[i]);
//				map.remove(brr[i]);
//				map.put(brr[i], val + 1);
				map.put(brr[i], val+1);
			}

			System.out.println(map);

		}

		for (int i = 0; i < arr.length; i++) {

			int k = map.get(arr[i]);

			if (k > 1) {

//				map.remove(arr[i]);
//				map.put(arr[i], k - 1);
				map.put(arr[i], k-1);

			}

			if (k == 1) {

				map.remove(arr[i]);
			}

		}

		int[] a = new int[brr.length - arr.length];

		int i = 0;

		for (int key : map.keySet()) {
			a[i] = key;
			i++;
		}

		Arrays.sort(a);
		
		return a;

	}

}
