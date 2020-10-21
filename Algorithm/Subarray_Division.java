package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarray_Division {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/the-birthday-bar/problem

		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> s = new ArrayList<Integer>();

		int n = scn.nextInt();
		
		
		int i = 0;
		while (i < n) {

			s.add(scn.nextInt());
			i++;
		}

		int ans = birthday(s, 4, 1);
		System.out.println(ans);
	}

	public static int birthday(ArrayList<Integer> s, int d, int m) {

		int count = 0;

		for (int i = 0; i < s.size(); i++) {
			int sum = 0;
			for (int j = i; j<s.size() &&  j < i+m; j++) {

				sum += s.get(j);

			}
			if (sum == d)
				count++;
		}

		return count;
	}
}
