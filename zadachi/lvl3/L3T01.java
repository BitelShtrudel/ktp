public class L3T01 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("amount of solutions: " + solutions(a,b,c));
	    }
	}
	public static int solutions(int a,int b,int c) {
		double d = Math.pow(b,2) - 4*a*c;
		if (d>0){
			return 2;
		}
		if (d==0){
			return 1;
		}
		else {
			return 0;
		}
	}
}