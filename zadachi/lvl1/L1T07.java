import java.util.ArrayList;
public class L1T07{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        int a = Integer.parseInt(s);
	        System.out.println("sum: " + addUpTo(a));
	    }
	}
	public static int addUpTo(int a){
		ArrayList <Integer> chisla = new ArrayList<>();
		int count=0;
		for(int i=1;i<=a;i++){
			chisla.add(i);
			count=count+i;
		}
		return count;
	}
}