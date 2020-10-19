package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Circular_Array_Rotation {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] queries = { 0, 1, 2 };
		circularArrayRotation(a, 2, queries);

	}

	public static int[] circularArrayRotation(int[] a, int k, int[] queries) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int val : a) {

			arr.add(val);
		}

		for (int i = 1; i <= k; i++) {

			int ele = arr.remove(arr.size() - 1);
			arr.add(0, ele);
		}

		//System.out.println(arr);

		int[] array = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {

			array[i] = arr.get(queries[i]);
		}

//		for (int i = 0; i < array.length; i++) {
//
//			System.out.println(array[i] + " ");
//		}
		
		return array;

	}
}
