public class L2T02{
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int[] chisla = new int[s.length];
            for (int j = 0; j < s.length; j++) {
            	chisla[j] = Integer.parseInt(s[j]);
       		}
            System.out.println("minmax difference = "+ differenceMaxMin(chisla));
        }
	}
	public static int differenceMaxMin(int[] a) {
		int max = a[1];
		int min = a[1];
		for (int i=0;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		return(max-min);
	}
}