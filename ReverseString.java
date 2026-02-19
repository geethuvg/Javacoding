package p2;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
public void reverseString(List<Character> s) {
		
		System.out.println("initial string is "+ s);
		
		List<Character> reverse = new ArrayList<>();
		for (int i=s.size()-1;i>=0;i--) {
			reverse.add(s.get(i));
		}
		System.out.println("String after reversal is "+ reverse);

	}

}
