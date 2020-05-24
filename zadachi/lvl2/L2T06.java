public class L2T06 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        int a = Integer.parseInt(s);
	        System.out.println("fibo: " + Fibonacci(a));
	    }
	}
	public static int Fibonacci(int a) {
		int b=0;
		int c=1;
		int fib=0;
		for(int i=1;i<=a;i++){
			fib=b+c;
			b=c;
			c=fib;
		}
		return fib; 
	}
}