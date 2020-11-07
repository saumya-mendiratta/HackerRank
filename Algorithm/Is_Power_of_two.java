package Algorithm;

public class Is_Power_of_two {

	public static void main(String[] args) {
		System.out.println(ispowerof2(4));

	}

	public static boolean ispowerof2(int a) {

		return a != 0 && ((a & (a - 1)) == 0);

	}

}
