package week2.day1;

public class AssignmentPalindrome {
	public static void main(String[] args) {
		String text = "Madam";
		String revText = "";
		for (int i = (text.length() - 1); i >= 0; i--) {
			revText = revText + text.charAt(i);
		}

		if (text.equalsIgnoreCase(revText)) {
			System.out.println(text + " is a Palindrome");
		} else {
			System.out.println(text + " is not a Palindrome");
		}

	}

}
