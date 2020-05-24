public class L1T01 {
	public static void main(String[] args){
	for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.println(a + " % " + b + " = "+ remainder(a, b));
        }
	}
	public static int remainder(int a, int b){
		return a%b;
	}
}