package challenge;
//find the vowels and index position
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Hello";
		        String vowels = "aeiouAEIOU";

		        for (char ch : str.toCharArray()) {
		            if (vowels.indexOf(ch) != -1) {
		                System.out.print(" "+ch + " "+"index:"+ str.indexOf(ch));
		            }
		        }
		

	}

}
