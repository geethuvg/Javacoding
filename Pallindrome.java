package p2;

import java.util.Arrays;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		
		boolean isPallindrome =  checkPallindrome(s);
		if(isPallindrome) {
			System.out.println("String is a pallindrome");
		}else
			System.out.println("String is not a pallindrome");
	}
	

	private static boolean checkPallindrome(String s) {
		// TODO Auto-generated method stub
		
		char array[] = s.toCharArray();
		char reverseArray[] = new char[array.length]  ;
		for(int i=0;i<array.length;i++) {
			reverseArray[array.length-(i+1)] = array[i];
		}
		boolean flag = Arrays.equals(array, reverseArray);
		return flag;
	}
	
}
