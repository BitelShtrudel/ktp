public class L1T03 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("legs: " + animals(a,b,c));
	    }
	}
	public static int animals(int chickens, int cows, int pigs) {
		chickens=chickens*2;
		cows=cows*4;
		pigs=pigs*4;
		return (chickens+cows+pigs);
	}
}