public class L3T09 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        int a = Integer.parseInt(s);
	        System.out.println("next prime: " + nextPrime(a));
	    }
	}
	public static int nextPrime(int number) {
		boolean prime = true;
		int next = number;
		while (true) {
			prime = true;
			for (int i = 2; i < next - 1; i++) {
				if (next % i == 0) prime = false;
			}
			if (prime) return next;
			next++;
		}
	}
}