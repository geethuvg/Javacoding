package p2;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {

		System.out.println("First fn call : " +isomorphicString("egg", "add"));
		System.out.println("Second fn call : " +isomorphicString("apple", "bnnbm"));
	}
	private static boolean isomorphicString(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		Map<Character, Character> m1 = new HashMap();
		Map<Character, Character> m2 = new HashMap();
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (m1.containsKey(c1)) {
				if (m1.get(c1) != c2) {
					return false;
				}
			} else {
				m1.put(c1, c2);
			}
			if (m2.containsKey(c2)) {
				if (m2.get(c2) != c1) {
					return false;
				}
			} else {
				m2.put(c2, c1);
			}
		}
		return true;
	}
}
