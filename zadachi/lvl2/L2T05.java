public class L2T05 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(".XX: " + getDecimalPlaces(s));
	    }
	}
	public static int getDecimalPlaces(String a) {
			char[] c = a.toCharArray();
			int i = 0;
			int n = c.length;
			while ((c[i] != '.') && (i < n-1)) {
				i++;
			}
			return c.length - i - 1;
		}
}