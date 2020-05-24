public class L1T04 {
	public static void main(String[] args){
	for (int i = 0; i < args.length; i++) {
	        String[] s = args[i].split(",");
	        Double a = Double.parseDouble(s[0]);
	        int b = Integer.parseInt(s[1]);
	        int c = Integer.parseInt(s[2]);
	        System.out.println("profitable: " + profitableGamble(a,b,c));
	    }
	}
	public static boolean profitableGamble(double prob,int prize,int pay){
		if (prob * prize > pay){
			return(true);
	}
		else {
			return(false);
		}
	}
}