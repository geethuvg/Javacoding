package p2;

import java.util.Scanner;

public class LargestNumString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		int first =Integer.parseInt (s.substring(0, 1));
		if(first == 0) {
			s= s.substring(1);
		}
		findLargest(s);
	}

	private static void findLargest(String s) {
		
		int last = s.length()-1;
		String lstChar = s.substring(last);
		int intChar = Integer.parseInt(lstChar);
		
		if(intChar %2 ==0) {
			s = s.substring(0, last);
		}
		System.out.println(s);
	}

}
