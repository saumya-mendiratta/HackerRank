package Algorithm;
import java.util.ArrayList;
import java.util.Scanner;
public class diagonal_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[][] arr = {{1,2,3} , {4,5,6} , {9,8,9}};
		//System.out.println(diagonalDifference(arr));
//		 Scanner scan = new Scanner(System.in);
//	        int i = scan.nextInt();
//	       double b = scan.nextDouble();
//	       scan.nextLine();
//	          String s = scan.nextLine();
//
//	        // Write your code here.
//
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + b);
//	        System.out.println("Int: " + i);
	}

	
	 public static int diagonalDifference(int[][] arr) {
		 
		 int n = arr.length;
		 
		 int sum1=0 ;
		 int sum2=0;
		 
		 for(int i=0; i <n ; i++) {
			 
			 for(int j=0; j<n ; j++) {
				 
				 if(i==j) { 
					 sum1+= arr[i][i];
				 }
				 if (i+j ==n-1) {
					 
					 sum2+= arr[i][j];
				 }
				 
			 }
			 
		 }
		 
		 
		 if(sum1-sum2 >0)
			 return sum1-sum2;
		 else
			 return sum2-sum1;
		 
		 
		 
	 }
}
