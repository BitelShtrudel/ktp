import java.util.*;
public class L2T04{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
            String[] s = args[i].split(",");
            int[] chisla = new int[s.length];
            for (int j = 0; j < s.length; j++) {
            	chisla[j] = Integer.parseInt(s[j]);
       		}
            System.out.println("that sum = "+ Arrays.toString(cumulativeSum(chisla)));
        }
	}
	public static int[] cumulativeSum(int[] a) {
		int[] new_mass=new int[a.length];
		int sum = 0;
		for(int i = 0;i < a.length; i++) {
			sum += a[i];
			new_mass[i] = sum;
		}
		return (new_mass); 
	}
}