package Algorithm;

public class Angry_Proffesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String angryProfessor(int k, int[] a) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] <= 0)
				count++;

			if (count >= k) {
				return "NO";
			}
		}

		return "YES";
	}
}
