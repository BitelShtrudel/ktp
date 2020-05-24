import java.util.*;
public class L4T10 {
	public static void main(String[] args) {
		String s = args[0];
		char c = args[1].charAt(0); 
		System.out.println(countUniqueBooks(s, c));
	}
public static int countUniqueBooks(String book, Character end) {
		Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
		boolean parse = false;
		for (char c: book.toCharArray()) {
			if (parse && c != end) chars.put(c, true);
			if (c == end) {
				if (parse) parse = false;
				else parse = true;
			}
		}
		return chars.size();
	}
}