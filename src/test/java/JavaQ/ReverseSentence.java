package JavaQ;

public class ReverseSentence {

	public static void main(String[] args) {

		String st = "I love java programming";
		String[] str = st.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}

	
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}	
	
	
	}

}
