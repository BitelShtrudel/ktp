public class L3T08 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(s + " longest zero: " + longestZero(s));
	    }
	}
	public static String longestZero(String s) {
		int count = 0;
		int a = 0;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.toString(s.charAt(i)).equals("0")) {
				a++;
			}
			else {
				a = 0;
			}
			if (a > count) {
				count=a;
			}
		}
		for (int i = 0; i < count; i++) {
			result += "0";
		}
		return result;
	}
}