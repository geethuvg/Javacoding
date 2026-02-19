package challenge;

public class testall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 -> n div by 3 - > fizz div by 5 -> buzz div by 3 and 5 -> fizzbuzz
		 */
		 int n = 15;
;
		 for (int i=1; i<=n; i++) {
			 if(i%3 ==0 && i%5 ==0) {
				 System.out.println(i+"=");
				 System.out.println("fizzbuzz");
			 }
			 if(i%3 == 0 && i%5 !=0) {
				 System.out.println(i+"=");
				 System.out.println("fizz");
			 }if(i%5 == 0 && i%3 != 0) {
				 System.out.println(i+"=");
				 System.out.println("buzz");
			 }
		 }
//////////////////////////////
		 
	}

}
