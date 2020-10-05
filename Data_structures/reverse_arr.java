package Data_structures;

public class reverse_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] reverseArray(int[] a) {

		int[] arr = new int[a.length];

		for (int i = a.length, j = 0; i >= 0; i--, j++)
			arr[j] = a[i];

		return arr;
	}
}
