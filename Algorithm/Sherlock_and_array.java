package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_and_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = scn.nextInt();
		
		for (int i = 0; i < n; i++) {
			arr.add(scn.nextInt());
			
		}
		
		System.out.println(balancedSums(arr));
	}

	public static String balancedSums(ArrayList<Integer> arr) {
		  
		int left[] = new int[arr.size()];
		left[0] = arr.get(0);
		
		
		int[] right = new int[arr.size()];
		right[arr.size() - 1] =  arr.get(arr.size() - 1);
		
		// left array
		for (int i = 1; i < arr.size(); i++)
			left[i] = left[i - 1] + arr.get(i);
		
		for (int i = arr.size() - 2; i >= 0; i--)
			right[i] = right[i + 1] + arr.get(i);
		
		for (int i = 0; i < arr.size(); i++) {
			if (left[i] == right[i]) {
				return "YES";
			}
		}
		
		return "NO";
		 
	 }

	
}
