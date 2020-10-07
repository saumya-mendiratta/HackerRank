package Algorithm;

import java.util.Arrays;

public class candies {

	public static void main(String[] args) {
	
		int[] arr = {2,4,3,5,2,6,4,5};
		System.out.println(candies(8, arr));
	}

	public static long candies(int n, int[] arr) {

		int[] strg = new int[n];
		Arrays.fill(strg, 1);

		for (int i = 1; i < n; i++) {

			if (arr[i] > arr[i - 1])
				strg[i] = Math.max(strg[i], strg[i - 1] + 1);

		}

		for (int i = n - 2; i >= 0; i--) {

			if (arr[i] > arr[i + 1])
				strg[i] = Math.max(strg[i], strg[i + 1] + 1);

		}

		int sum=0;
		for(int i=0 ; i< n ; i++) {
			sum+=strg[i];
		}
		return sum;
	}
}
