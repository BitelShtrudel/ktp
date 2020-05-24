import java.util.*;
public class L3T05 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(s + " is hex? " + isValidHexCode(s));
	    }
	}
	public static boolean isValidHexCode(String s) {
	String[] test = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F","a", "b", "c", "d", "e", "f"};
	List<String> list=Arrays.asList(test);
	if ((s.length()==7) && s.charAt(0) == '#') {	
		for (int i = 1; i < s.length(); i++) {
			if (list.contains(Character.toString(s.charAt(i)))) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	return false;
	}
}