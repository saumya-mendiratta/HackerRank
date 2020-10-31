package Algorithm;

public class Flag {

	public static void main(String[] args) {
		
		System.out.println(flag(10));
	}

	public static int flag(int n) {

		if(n==1)
			return 2; 
		
		
		int lt = flagW("w", true, n);
		int rt = flagW("r", false, n);
		
		return lt+rt;

	}

	public static int flagW(String str, boolean bool, int n) {

		if (str.length() == n) {

			return 1;
		}

		int b=0,r=0,w=0;
		
		if (str.endsWith("w")) {

			if(str.length()!=n-1)
			 b += flagW(str + "b", bool, n);
			
			 r+= flagW(str + "r", false, n);
			 
			

		}

		else if (str.endsWith("b")) {

			if(bool==false)
			 w += flagW(str + "w", true, n);
			
			if(bool)
			 r += flagW(str + "r", false, n);
			
			
		}

		else if (str.endsWith("r")) {

			 w += flagW(str + "w", true, n);
			 
			 if(str.length()!=n-1)
			 b += flagW(str + "b", bool, n);
			 
			
			
		}
		 return w+b+r ; 
	}
}
