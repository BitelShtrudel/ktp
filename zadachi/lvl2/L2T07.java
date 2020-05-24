public class L2T07 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(s + " is index??? : " + isValid(s));
	    }
	}
	public static boolean isValid(String ind) {
	if (ind.length() != 5){
			return false;
		}
	 try {
			int number = Integer.parseInt(ind);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}