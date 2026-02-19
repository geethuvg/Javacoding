package p2;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenListofList {

	public static void main(String[] args) {

		List<List<Integer>> listOfList = List.of(
												List.of(1,2),
												List.of(10,20),
												List.of(50,100)
												);
		
		List<Integer> flattenedList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
		flattenedList.forEach(e->System.out.println(e));
	}

}
