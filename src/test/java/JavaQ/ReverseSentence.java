package JavaQ;

public class ReverseSentence {

	public static void main(String[] args) {

		String st = "anau minau";
		String[] str = st.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

}
