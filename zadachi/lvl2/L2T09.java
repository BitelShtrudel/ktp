public class L2T09 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            System.out.println(i + " suffix? " + isSuffix(s[0], s[1]));
            System.out.println(i + " prefix? " + isPrefix(s[0], s[1]));
        }
	}
	
	public static boolean isSuffix(String word, String suf) {
		suf = suf.replace("-", "");
		int raz = word.length() - suf.length();
		if (isEqual(suf, word.substring(raz))) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrefix(String word, String pref) {
		pref = pref.replace("-", "");
		if (isEqual(pref, word.substring(0,pref.length()))) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isEqual(String w1, String w2) {
		if (w1.length() == w2.length()) {
			for (int i = 0; i < w1.length(); i++){
				if (w1.charAt(i) != w2.charAt(i)){
					return false;
				}				
			}
			return true;
		}
		else {
			return false;
		}
	}

}