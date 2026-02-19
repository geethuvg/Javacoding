package p2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubD
		
		/*
		 * List<Integer> s= List.of(20,40,70,30,50);
		 * //s.stream().sorted(Comparator.comparing(e->e, rever)) Optional<Integer> l =
		 * s.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		 * System.out.println(l);
		 */
		//nteger Array of {2,7,11,14,15} to print target as 21
		Integer[] intArray = {2,7,11,14,15};
		Integer  s = 0, firstIndex= 0, secondindex =0;
		for (int i=0; i<intArray.length; i++) {
			for (int j=1; j<intArray.length;j++) {
				s = intArray[i]+intArray[j];
				if(s == 21) {
					firstIndex = j;
					secondindex = i;
				}
			}
		}
		System.out.println("first index :"+firstIndex+" second index :"+secondindex);
	}

}
