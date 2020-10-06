package Data_structures;

public class reverse_arr {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		int[] ar= reverseArray(arr);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

	public static int[] reverseArray(int[] a) {

		int[] arr = new int[a.length];

		for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
			arr[j] = a[i];

		return arr;
	}
}
