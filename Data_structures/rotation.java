package Data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i< n ; i++)
			arr.add(scn.nextInt());
		
		System.out.println(rotateLeft(d, arr));
		
	
	}

	public static ArrayList<Integer> rotateLeft(int d, ArrayList<Integer> arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int val: arr)
			list.add(val);
		
		//System.out.println(list);
		
		for(int i=0; i<d ; i++) {
			
			int k = arr.get(i);
			list.remove(0);
			list.add(k);
		}
		
//		for(int i=0;i<d;i++)
//			list.remove(0);
		
		return list;
	}

}
