public class L3T02 {
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < args.length; i++) {
            s += args[i] + " ";
        }
        System.out.println("last 'zip' index: " + findZip(s));
	}
	public static int findZip(String line) {
		if (line.lastIndexOf("zip") != line.indexOf("zip") && line.indexOf("zip") != -1 ) {
			return line.lastIndexOf("zip");
		}
		return -1;
	}
}