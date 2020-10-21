package Algorithm;

public class divide_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int divisibleSumPairs(int n, int k, int[] ar) {

	      int count=0;
	        //checking aginst the condition
	        for(int i=0;i<(n-1);i++){
	            for(int j=0;j<n;j++){
	                if(i<j){
	                    if((ar[i]+ar[j])%k==0)
	                        count++;
	                }
	            }
	        }
	        return count; 

	    }
}
