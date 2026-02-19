package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input;
		List <Integer> s = new ArrayList<>();
		for(int i=0;i<5;i++) {
		   input = sc.nextInt();
		   s.add(input);
		}
		
		findEven(s);
	}

	private static void findEven(List<Integer> s) {
		// TODO Auto-generated method stub
		 List <Integer> evenList = s.stream()
				 					.filter(e -> e%2 ==0).toList();
		 evenList.forEach(e-> System.out.println(e));
	}
}
