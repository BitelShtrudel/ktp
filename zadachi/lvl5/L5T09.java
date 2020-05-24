public class L5T09 {
    public static void main(String[] args){
        for (int i = 0; i < args.length - 1; i++) {
            s += args[i] + " ";
        }
        s += args[args.length - 1];
        System.out.println(correctTitle(s));
    }
 	public static String correctTitle(String str) {
		String[] words = str.split(" ");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			if (i>0) {
				output += " ";
			}
			String[] wordsNoHyphens = words[i].split("-");
			for (int j = 0; j < wordsNoHyphens.length; j++) {
				if(j>0) {
					output += "-";
				}
				if (wordsNoHyphens[j].equalsIgnoreCase("and")
					 || wordsNoHyphens[j].equalsIgnoreCase("the")
					 || wordsNoHyphens[j].equalsIgnoreCase("of")
					 || wordsNoHyphens[j].equalsIgnoreCase("in")) {
					output += wordsNoHyphens[j].toLowerCase();
				}
				else {
					output += wordsNoHyphens[j].substring(0,1).toUpperCase();
					output += wordsNoHyphens[j].substring(1).toLowerCase();
				}
			}
		}
		return output;
	}
}