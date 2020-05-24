import java.util.*;
public class L4T04 {
	public static void main(String[] args){
		double[] a = new double[4];
		for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        a[0] = Double.parseDouble(s[0]);
	        a[1] = Double.parseDouble(s[1]);
	        a[2] = Double.parseDouble(s[2]);
	        a[3] = Double.parseDouble(s[3]);
	        System.out.println(overTime(a));
	    }
	}
	public static String overTime(double[] arr) {
		double sum=0.0;
		for(double i=arr[0]; i<arr[1]; i+=0.25){
			if(i<17){
				sum += 0.25 * arr[2];
			} else if(i>=17) {
				sum += 0.25 * arr[2] * arr[3];
			}
		}
		return String.format("$%.2f", sum);
	}
}