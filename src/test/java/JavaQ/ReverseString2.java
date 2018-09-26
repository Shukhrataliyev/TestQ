package JavaQ;

public class ReverseString2 {

	public static void main(String[] args) {

		String name = "This String will be getting reversed";
		System.out.println("Original Name: " + name);
		System.out.println("After Reverse: ");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
