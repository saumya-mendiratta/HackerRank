package Algorithm;

public class Save_the_prisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(saveThePrisoner(5, 2, 2));
	}

	public  static int saveThePrisoner(int n, int m, int s) {

		return ((m-1)+(s-1)%n +1);
}
}
