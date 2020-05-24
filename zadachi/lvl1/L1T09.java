public class L1T09 {
	public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int[] chisla = new int[s.length];
            for (int j = 0; j < s.length; j++) {
            	chisla[j] = Integer.parseInt(s[j]);
       		}
            System.out.println("sum of cubes = "+ sumOfCubes(chisla));
        }
	}
	public static int sumOfCubes(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count += Math.pow(a[i], 3);
		}
		return count;
	}
}