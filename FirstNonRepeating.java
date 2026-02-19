package p2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "lJava is awsomejl";
		Set<Character> distinct = new LinkedHashSet<>();
		Set<Character> repeated = new  HashSet<>();
		str.toLowerCase().chars().mapToObj(c-> (char) c).forEach(c ->{
			if(!distinct.add(c)) {
				repeated.add(c);
			}
		});
		char first = distinct.stream().filter(c-> !repeated.contains(c)).findFirst().orElse(null);
		System.out.println(first);
	}

}
