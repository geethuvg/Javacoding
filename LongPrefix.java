package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongPrefix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input ="";
		List <String> s = new ArrayList<>();
		for(int i=0;i<5;i++) {
		   input = sc.next();
		   s.add(input);
		}
		System.out.println(findLongCommonPrefix(s));
	}

	private static String findLongCommonPrefix(List<String> s) {
		
		String prefix = s.get(0);
		for (int i=1; i< s.size(); i++) {
			while(!s.get(i).startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
}
