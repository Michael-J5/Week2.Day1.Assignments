package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		char character = 'e';
		int i = 0;
		String strLC = str.toLowerCase();
		char[] cs = strLC.toCharArray();
		int length = cs.length;
		for (int j = 0; j < length; j++) {
			if (cs[j] == character) {
				i++;
			}
		}
		System.out.println("Character repeated for " + i + " times.");
	}

}
