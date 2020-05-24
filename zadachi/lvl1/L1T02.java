public class L1T02 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.println(" a = " + a + "; b = " + b + "; triangle area = "+ triArea(a, b));
        }
	}
	public static int triArea(int a, int b) {
		if (a > 0 && b > 0) {
			return (a*b)/2;
		} 
		else {
			return 0;
		}
	}
}