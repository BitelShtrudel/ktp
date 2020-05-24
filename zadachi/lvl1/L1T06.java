public class L1T06{
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			char[] c = s.toCharArray();
			for (int j = 0; j < c.length; j++) {
	            System.out.println("'" + c[j] + "' ascii: " + ctoa(c[j]));
	        }	
	    }
	}
	public static int ctoa(char a) {
		return (int)a;
	}
}