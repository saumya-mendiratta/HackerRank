package Algorithm;

import java.util.ArrayList;

public class Power_Sum {

	public static void main(String[] args) {

		System.out.println(powerSum(100, 3));
	}

	public static int powerSum(int X, int N) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i < 100; i++) {

			if (Math.pow(i, N) <= X) {

				arr.add((int) Math.pow(i, N));

			}
		}
 
	  int ways=	powersumhelper(arr, X , 0);
	  
	  return ways;
		
	}

	public static int powersumhelper(ArrayList<Integer> arr, int X , int vidx) {
		
		if(X==0)
			return 1; 
		
		if(vidx == arr.size())
			return 0;
		
		
		int no=powersumhelper(arr, X , vidx+1);
		int yes=powersumhelper(arr, X - arr.get(vidx) , vidx+1);
		
		return yes+no;
		

	}

}
