package p2;

import java.util.stream.IntStream;

public class PallindromeStream {

	public static void main(String[] args) {

		String str1 ="Madam";
		String str = str1.toLowerCase();
		boolean isPallindrome = IntStream.range(0, str.length()/2)
				.allMatch(i-> str.charAt(i) == str.charAt(str.length()-1-i));
		System.out.println(isPallindrome);
		
}
}
