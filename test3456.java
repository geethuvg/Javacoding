package challenge;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
// Count occurrence of each letter in a sentence
public class test3456 {

	public static void main(String[] args) {
		
		String s = "My name is Geethu" ;
		Map<Character, Long> a = s.replace(" ", "").toLowerCase()
				.chars()
				.mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		a.entrySet().stream()
		.filter(e-> e.getValue()>1)
		.forEach(l -> System.out.println(l.getKey()+" "+l.getValue()));
		System.out.println(a);

	}

}
