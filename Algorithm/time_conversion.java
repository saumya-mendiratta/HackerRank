package Algorithm;

public class time_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "11:30:59PM";
		System.out.println(timeConversion(s));
	//	System.out.println(s.substring(8));
	//	System.out.println(s.substring(0,2));
//		int n = Integer.parseInt(s.substring(0,2)) + 12;
//		System.out.println(n);
	}

	public static String timeConversion(String s) {
		
		String ans="";
		int hr = Integer.parseInt(s.substring(0,2));
		int min = Integer.parseInt(s.substring(3,5));
		int sec = Integer.parseInt(s.substring(6,8));
		
		if(hr ==12 && s.contains("AM")) {
			ans="00" + s.substring(2,8);
		}else if(hr<12 && s.contains("PM")) {
			hr+= 12;
			ans= hr + s.substring(2,8);
		}else {
			ans=s.substring(0,8);
		}
		
		return ans;
	}
}
