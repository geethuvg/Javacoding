package p2;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output for the first inputs is : "+rotateString("abcde", "cdeab"));
		System.out.println("Output for the first inputs is : "+rotateString("abcde", "adeac"));
	}

	private static boolean rotateString(String s1, String s2) {
		if (s1.length() == s2.length()) {
			String sum = s1 + s1;
			if (sum.contains(s2)) {
				return true;
			}else
				return false;
		}else {
			return false;
		}
		
	}

}
