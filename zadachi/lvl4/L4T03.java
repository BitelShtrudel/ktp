import java.util.*;
public class L4T03 {
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
	        String s = args[i];
	        System.out.println(s + " camel: " + toCamelCase(s));
	        System.out.println(s + " snake: " + toSnakeCase(s));
	    }
	}
	public static String toCamelCase(String str) {
		String []arr=str.split("_");
		String new_str=arr[0];
		for(int i=1;i<arr.length;i++) {
			new_str+=(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
		}	
		return new_str;
	}

	public static String toSnakeCase(String str) {
		String new_str="";
		for(int i=0;i<str.length()-1;i++) {
			if(str.substring(i,i+1).matches("[A-Z]")) {
				new_str=new_str + "_" + str.substring(i,i+1).toLowerCase();
			} else {
				new_str+=str.substring(i,i+1);
			}
		}
		new_str+=str.substring(str.length()-1);
		return new_str;
	}
}