package Algorithm;

public class Sherlock_and_squares {

	public static void main(String[] args) {

		System.out.println(squares(17, 24));
		//System.out.println(Math.floor(2.555));
	}

	public static int squares(int a, int b) {
		
		double asr= Math.sqrt(a);
		double bsr= Math.sqrt(b);
		
		int count =(int) (Math.floor(bsr) - Math.floor(asr));
		
		if(asr - Math.floor(asr) ==0 || bsr - Math.floor(bsr) ==0 )
			count++;
		
		return count;
		
	}

}
