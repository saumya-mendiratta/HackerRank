package Algorithm;

import java.util.ArrayList;

public class compare_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b) {
		 
		 int sum1=0;
		 int sum2=0;
		 
		 for(int i=0 ; i<a.size() ; i++) {
			 
			 if(a.get(i) > b.get(i))
				 sum1+=1;
			 else if(a.get(i) < b.get(i))
				 sum2+=1;

		 }
		 
		 ArrayList<Integer> ans = new ArrayList<Integer>();
		 
		 ans.add(sum1);
		 ans.add(sum2);
		 
		 return ans;
	 }
}
