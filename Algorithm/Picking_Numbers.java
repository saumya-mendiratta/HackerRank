package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Picking_Numbers {

    public static void main(String[] args) {
        
        Scanner scn= new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        
        maxFreqChar(arr);
    }

    public static void maxFreqChar(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		// frequency map create
		for (int i = 0; i < arr.length; i++) {

			int ch =arr[i];
			int of = map.getOrDefault(ch, 0);
			map.put(ch, of + 1);

		}
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int key :map.keySet()) {
			
			list.add(map.get(key));
			System.out.println(key + " " + map.get(key));
		}
	     // sorting arraylist needs to be done first 
		
		
		int max =0;
		for(int i = 1 ; i < list.size() ; i++) {
			
			int ans = list.get(i) + list.get(i-1);
			if(ans>max)
				max=ans;
			
		}
		
		System.out.println(max);
    }
}
		

