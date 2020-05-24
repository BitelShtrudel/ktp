public class L2T08 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            System.out.println(isStrangePair(s[0], s[1]));
        }
	}
	public static boolean isStrangePair(String a,String b) {
		if((a.charAt(0) == b.charAt(b.length()-1)) && (a.charAt(a.length()-1) == b.charAt(0))) {
			return true;
		}
		return false;
	}
}