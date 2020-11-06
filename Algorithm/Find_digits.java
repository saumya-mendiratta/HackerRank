package Algorithm;

public class Find_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findDigits(111));
	}

	public  static int findDigits(int n) {

		int count=0;
		
		int num=n;
				
       while(n>0) {
    	   
    	   int a =n%10;
    	   n=n/10;
    	   
    	   if(a==0)
    		   continue;
    	   
    	   if(num%a==0)
    		   count++;
    	   
       }
		
       return count;
    }
}
