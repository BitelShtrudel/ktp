public class L2T10 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        int a = Integer.parseInt(s);
	        System.out.println("fields filled in: " + boxSeq(a));
	    }
	}
	public static int boxSeq(int step) {
	if (step % 2 != 0) {
			return step+2;
		}
		return step;
	}
}