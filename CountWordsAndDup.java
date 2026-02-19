package p2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class CountWordsAndDup {

	public static void main(String[] args) {
		String str="java is an programming language";
		countWords(str.toCharArray());
		findDup(str);
		countWordsSplit(str);
	}
	
	private static void countWordsSplit(String str) {// more accepatable
		
		Long l = Arrays.stream(str.trim().split("\\s")).count();
		System.out.println(l);
	}

	private static void countWords(char[] charArray) {
	long count = IntStream.range(0, charArray.length)
			.map(e ->charArray[e])
			.filter(Character::isWhitespace)
			.count();
	System.out.println("Number of words = "+ (count));
		
	}
	
	private static void findDup(String str) {
		Set<Character> ch = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		for (char ch1 : str.replace(" ", "").toCharArray()) {
			if(!ch.add(ch1)) {
				dup.add(ch1);
			}
		}
		System.out.println("Duplicates char "+dup);		
	}

}
