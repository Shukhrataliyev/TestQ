package JavaQ;

import java.util.Iterator;

public class UniqueChar {
	
	public static void main(String[] args) {
		
		String str = "asdfsddffd";
		String unq = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!unq.contains(str.charAt(i)+"")){
				unq +=str.charAt(i);
			}
			
		}
		
		System.out.println(unq);
		
		
	}

}
