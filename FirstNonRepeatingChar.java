package p2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String data = "abcabasdsssdffgghhjii";
		Map<Character, Long> charWithFrequency = data.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charWithFrequency);

		Character c2 = data.chars().mapToObj(c -> (char) c)
				.filter(chr -> charWithFrequency.get(chr) == 1)
				.findFirst().orElse(null);

		System.out.println("First Non repeating character is "+c2);
	}
}
