public class L1T05 {
	public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("operation: " + operation(a,b,c));
	    }
	}
	public static String operation(int n,int a,int b) {
		if (a*b == n) {
			return("multiplication");
		}
		if ((a/b==n) || (b/a==n)) {
			return("division");
		}
		if (a+b == n) {
			return("addition");
		}
		if ((a-b)==n || (b-a)==n) {
			return("subtraction");
		}
		return ("none");
	}
}