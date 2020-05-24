public class L1T10 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("abcmath: " + abcmath(a,b,c));
	    }
	}
	public static boolean abcmath(int a,int b,int c) {
		for (int i = 0; i < b; i++) {
			a += a;
		}
		return (a % c == 0);
	}
}