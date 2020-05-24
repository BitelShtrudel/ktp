import java.util.*;

public class L4T02 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(s + " clustered: " + Arrays.toString(split(s)));
	    }
	}
	public static String[] split(String str) {
		List<String> list = new ArrayList<>();
		int count = 0;
		int lastIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			}
			else {
				count--;
			}
			if (count == 0) {
				list.add(str.substring(lastIndex, i + 1));
				lastIndex = i + 1;
			}
		}
		String[] strs = new String[list.size()];
		return strs = list.toArray(strs);
	}
}