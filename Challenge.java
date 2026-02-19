package challenge;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
		int a = nums.stream()
				.filter(n-> n%2 ==0)
				.reduce(0, Integer::sum);
		System.out.println(a);
		
		int max = nums.stream()
				.max(Integer::compareTo)
				.orElseThrow();
		System.out.println(max);
		
		Optional<Integer> secondHigh = nums.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		System.out.println(secondHigh);
		
		List<String> list = List.of("apple", "banana", "apple");
		Map<String, Integer> al = list.stream()
				.collect(Collectors
						.toMap(Function.identity(), String::length,(v1, v2)->v1));
		System.out.println(al);
		


	}

}