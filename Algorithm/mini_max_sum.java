package Algorithm;

import java.util.Arrays;

public class mini_max_sum {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		miniMaxSum(arr);
	}

	public static void miniMaxSum(int[] arr) {
		
		Arrays.sort(arr);
		int sum=0;
		
		for(int i=0 ; i < arr.length ; i++) 
				sum+=arr[i];
		
		System.out.println((sum-arr[arr.length-1]) + " " + (sum-arr[0]));
		
	}
}
