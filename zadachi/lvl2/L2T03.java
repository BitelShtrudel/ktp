public class L2T03 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int[] chisla = new int[s.length];
            for (int j = 0; j < s.length; j++) {
            	chisla[j] = Integer.parseInt(s[j]);
       		}
            System.out.println("is average whole?? = "+ isAvgWhole(chisla));
        }
	}
	public static boolean isAvgWhole(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		if(sum%a.length == 0) {
			return true;
		}
		return false;
		}
}