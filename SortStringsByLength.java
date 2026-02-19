package p2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortStringsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = List.of("Java","is","very","vast");
		Stream<String> lsorted = l.stream().sorted(Comparator.comparing(String::length).reversed());
		lsorted.forEach(t -> System.out.println(t));

	}

}
