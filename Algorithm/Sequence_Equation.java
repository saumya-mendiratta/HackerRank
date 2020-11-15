package Algorithm;

import java.util.HashMap;

import com.sun.org.apache.regexp.internal.recompile;

public class Sequence_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p= {2,3,1};
		
		int[] ans=permutationEquation(p);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	public static int[] permutationEquation(int[] p) {

		int n=p.length;
		int[] ans = new int[n];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < p.length; i++) {
			
			map.put(p[i] , i+1);
		}		
		
		//System.out.println(map);
		
		int x=1;
		for (int i = 0; i < n; i++) {
			
			int k = map.get(map.get(x));
			ans[i]=k;
			x++;
		}
		
		return ans;
    }

	
}
