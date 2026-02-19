package p2;

import java.util.List;

public class ToUppercase {

	public static void main(String[] args) {
		
		List<String> strList = List.of("Hai","Hello","India","Java","Python");
		List<String> strListUpper =strList.stream()
												.map(String::toUpperCase)
												.toList();
		strListUpper.forEach(s->System.out.println(s));

	}

}
