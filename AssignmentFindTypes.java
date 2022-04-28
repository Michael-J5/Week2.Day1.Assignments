package week2.day1;

public class AssignmentFindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] cs = test.toCharArray();
		int length = cs.length;
		System.out.println("Total length of the String: " + length);
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(cs[i]))
				letter++;
			else if (Character.isDigit(cs[i]))
				num++;
			else if (Character.isSpaceChar(cs[i]))
				space++;
			else
				specialChar++;
		}
		System.out.println("Letters: " + letter);
		System.out.println("Numbers: " + num);
		System.out.println("Spaces: " + space);
		System.out.println("Special Characters: " + specialChar);
	}
}
