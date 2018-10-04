package JavaQ;

public class FindDupCharWithoutCollection {

	public static void main(String argu[]) {

		String str = "w3schoools";
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			int cnt = 1;
			boolean b = false;
			char str2 = '\u0000';
			for (int j = i + 1; j < str.length(); j++) {
				if (inp[i] == inp[j]) {
					b = true;
					str2 = inp[j];
					if (str2 == '\u0000') {
						System.out.println(str2);
					}	
					cnt++;
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
