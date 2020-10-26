package Data_structures;

import java.util.Arrays;

public class Array_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long arrayManipulation(int n, int[][] queries) {

		long arr[] = new long[n + 2];
		Arrays.fill(arr, 0);

		for (int i = 0; i < queries.length; i++) {

			int sidx = queries[i][0];
			int eidx = queries[i][1];

			arr[sidx] += queries[i][2];
			arr[eidx + 1] -= queries[i][2];

		}

		long max = Integer.MIN_VALUE;
		for (int i = 1; i < n + 2; i++) {

			arr[i] += arr[i - 1];

			if (arr[i] > max)
				max= arr[i];

		}
		
		return max;
	}
}
