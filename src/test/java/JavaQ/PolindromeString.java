package JavaQ;

public class PolindromeString {
	public static void main(String[] args) {
		System.out.println(isPalindrome("malayalam"));
	}

	public static boolean isPalindrome(String word) {
		String str = "";
		for (int i=word.length()-1; i>=0;  i--){
			str += word.charAt(i);
		}
		if(str.equalsIgnoreCase(word)){
			return true;
		}else{
			return false;
		}

	}
}