package JavaQ;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseIt("Almaty"));
		
	}
	public static String reverseIt(String source) {
		int i, len = source.length();
		StringBuilder dest = new StringBuilder(len);

		for (i = (len - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}

		return dest.toString();
	}
}
