public class L2T01{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int b = Integer.parseInt(s[1]);
            System.out.println(repeat(s[0], b));
        }
	}
	public static String repeat(String a, int repeats) {
		String repeat = "";
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < repeats; j++) {
				repeat += a.charAt(i);
			}
		}
		return repeat;
	}
}