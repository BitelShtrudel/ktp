public class L3T03 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        int a = Integer.parseInt(s);
	        System.out.println("is perfect: " + checkPerfect(a));
	    }
	}
public static boolean checkPerfect(int n) {
		int result = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				result += i;
			}
			if (result > n) {
				return false;
			}
		}
		return (result == n);	
	}
}