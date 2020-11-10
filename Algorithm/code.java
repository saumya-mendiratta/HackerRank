package Algorithm;

import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] start = new int[10];
		int min = 1;
		int max=0;

		for (int i = 0; i < n; i++) {
			int k = scn.nextInt();
			start[k] = 1;
		}

		int arr[] = new int[9];

		for (int i = 2; i < 9; i++) {

			if (start[i] == 1) {

				if (start[i + 1] == 1 || start[i + 2] == 1)
					min++;
				break;

			}

		}
		
		for(int i=9 ; i>=2 ; i--) {
			
			if (start[i] == 1) {

				if (start[i -1] == 1 || start[i - 2] == 1)
					max++;

			}
			
		}

		System.out.println(min + " " +  max);
	}

}
