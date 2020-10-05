package Algorithm;

import java.util.ArrayList;

public class birthday_cake_candles {

	public static void main(String[] args) {
		
		

	}

	public static int birthdayCakeCandles(ArrayList<Integer> candles) {
		
		int max=Integer.MIN_VALUE;
		int c=0;
		for(int val : candles) {
			
			if(val > max)
			max=val;
		}
		
		for(int val : candles) {
			
			if(val==max)
				c++;
			
		}
		return c;
		
	}
}
