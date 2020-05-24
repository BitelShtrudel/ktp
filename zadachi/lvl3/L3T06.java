import java.util.*;
public class L3T06 {
	public static void main(String[] args) {
		String[] s1 = args[0].split(",");
		String[] s2 = args[1].split(",");
		int[] a1 = new int[s1.length];
		int[] a2 = new int[s2.length];
        for (int i = 0; i < s1.length; i++) {
        	a1[i] = Integer.parseInt(s1[i]);
       	}
		for (int i = 0; i < s2.length; i++) {
        	a2[i] = Integer.parseInt(s2[i]);
       	}
		System.out.println(same(a1, a2));
	}
	public static boolean same(int[] arr1,int[] arr2) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			list1.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			list2.add(arr2[i]);
		}
		for(int i=0;i<list1.size();i++) {
				for(int j=1;j<arr1.length;j++){
					if (arr1[i] == arr1[j] && (i != j)) {
						list1.remove(i);
					}
				}	
			}	
		for(int i=0;i<list2.size()-1;i++){
				for(int j=1;j<arr2.length;j++){
					if (arr2[i] == arr2[j] && (i != j)) {
						list2.remove(i);
					}
				}	
			}
		if(list1.size()==list2.size()){
			return true;
			}
		return false;
	}
}
