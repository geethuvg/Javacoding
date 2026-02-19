package p2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test1 {

	public static void main(String[] args) {
		
		String s ="java stream api java stream";
		List<String> list = Arrays.asList(s.split("\\s"));
		//findCharCount(s);
		findCharCountStream(s);
		//findWordCount(list);
		//findSumofIntegers(Arrays.asList(1,2,3,4,5,6,7,8));
		//findMaxNumber(Arrays.asList(1,2,3,4,5,6,7,8));
		List<Employee15> empl = List.of
				(new Employee15(1001, "Alice", "HR", 50000,30),
		        new Employee15(1002, "Bob", "IT", 70000, 25),
		        new Employee15(1003,"Charlie", "HR", 60000,28),
		        new Employee15(1005,"David", "IT", 80000,31),
		        new Employee15(1004,"Eve", "Finance", 90000,34));
		//countInEachDep(empl);
		//partitionByAge30(empl);
	}
	
	private static void findCharCountStream(String s) {
		
		Map<Character, Long>  l =s.toLowerCase().chars().
				                   mapToObj(c-> (char) c).collect(Collectors.groupingBy(e->e, Collectors.counting()));
				                   System.out.println(l);
	}

	private static void findCharCount(String s) {
		
		char[] a = s.replace(" ", "").toCharArray();
		System.out.println(a);
		Map<Character, Integer> op = new HashMap<>();
		int value;
		for(int i=0;i<a.length;i++) {
			value =1;
			if(op.containsKey(a[i])) {
				value = (op.get(a[i]))+1;
				 op.replace(a[i], value);
			}else {
				op.put(a[i], value);
			}
		}
		System.out.println(op);
	}
	private static void findWordCount(List<String> list) {
		Map<Object, Long> m = list.stream()
				.collect(Collectors.groupingBy(
						e->e, Collectors.counting()
						
						));
		m.forEach((w,c)-> System.out.println(w+" :"+ c));		
	}

	private static void partitionByAge30(List<Employee15> empl) {
		
		Map<Boolean, List<String>> t =empl.stream()
				.collect(Collectors.
						partitioningBy(e->e.getAge()>30,
						Collectors.mapping(
								Employee15::getName, 
								Collectors.toList())));
		t.forEach((e,m) -> System.out.println(e+":"+m));
		
	}

	private static void countInEachDep(List<Employee15> empl) {
		Map<String, Long> deptWise =empl.stream().collect(Collectors.groupingBy(Employee15::getDepartment,Collectors.counting()));
		deptWise.forEach((s,l)->System.out.println(s+":"+l));
		
	}

	private static void findMaxNumber(List<Integer> asL) {
		int max = asL.stream().reduce(0,Integer::max);
		System.out.println(max);
		
	}

	private static void findSumofIntegers(List<Integer> asList) {
		int  l = asList.stream().reduce(0,Integer::sum);
		
		System.out.println(l);
		
	}

}
