package Algorithm;

import java.util.Scanner;

public class design_pdf_viewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
	
		int[] h= new int[26];
		for (int i = 0; i < 26; i++) {
			h[i] =scn.nextInt();
		}
		System.out.println(designerPdfViewer(h, "abc"));
	}

	public static int designerPdfViewer(int[] h, String word) {
		
		int n = word.length();
		int max= Integer.MIN_VALUE;
		for(int i=0; i<word.length();i++) {
			
			char ch= word.charAt(i);
			int asc =(int)ch;
			
			if(h[asc-97]>max)
				max=h[asc-97];
			
		}
		return max*n;
	}
}
