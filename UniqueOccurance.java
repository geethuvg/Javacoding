package p2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueOccurance {

	public static void main(String[] args) {
		String s = "tree";
		Map<Character, Long> mp = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()
						));
		Map<Character, Long> sortedDesc = mp.entrySet().stream()
				.sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o,n)->o,LinkedHashMap::new));
		
		System.out.println(sortedDesc);

	}

}
