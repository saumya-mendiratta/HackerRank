package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Cracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n= scn.nextInt();
		
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=scn.nextInt();
		}
		
		//int[] arr= {40,60,20};
		int[][] strg = new int[arr.length][arr.length];

		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		
		System.out.println(min(arr, 0, n-1 , strg));
	}

	public static int min(int[] arr, int si, int ei, int[][] strg) {

		if (si == ei) {
			return 0;
		}

		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si; k <= ei - 1; k++) {

			int fp = min(arr, si, k, strg);
			int sp = min(arr, k + 1, ei, strg);

			int sw = power(arr, si, k) * power(arr, k + 1, ei);

			int total = fp + sp + sw;

			if (total < min) {
				min = total;
			}

		}

		strg[si][ei] = min;

		return min;

	}
	
	public static int power(int[] arr, int i, int j) {

		int sum = 0;

		for (int k = i; k <= j; k++) {

			sum += arr[k];

		}

		return sum % 100;
	}

}
