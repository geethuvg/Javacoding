package challenge;

import java.util.HashMap;
import java.util.Map;
// Find duplicate elements and their occurrence count - Integer array
public class test1234 {

	public static void main(String[] args) {
		int[] a = { 45, 67, 45, 89, 45, 89, 78 };
		int count;
		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					m.put(a[i], ++count);
				}
			}
		}
		System.out.println(m);
	}

}
