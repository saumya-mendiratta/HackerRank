package Algorithm;

public class plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,0,-1,-1};
		plusMinus(arr);
	}

	public static void plusMinus(int[] arr) {

		float sump = 0;
		float sumn = 0;
		float sum0 = 0;

		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0)
				sump += 1;
			else if (arr[i] < 0)
				sumn += 1;
			else if (arr[i] == 0)
				sum0 += 1;

		}

		System.out.println(sump/n);
		System.out.println(sumn/n);
		System.out.println(sum0/n);
		
	}
}
