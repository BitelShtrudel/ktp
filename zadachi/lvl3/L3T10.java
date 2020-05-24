import java.util.*;
public class L3T10 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        int a = Integer.parseInt(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("right triangle? : " + rightTriangle(a,b,c));
	    }
	}
	public static boolean rightTriangle(int a, int b, int c) {
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		return (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2));
	}
}