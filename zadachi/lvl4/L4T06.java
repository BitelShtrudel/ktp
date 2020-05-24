public class L4T06 {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            int a = Integer.parseInt(s);
            System.out.println(a + " is bugger???: " + bugger(a));
        }
    }
    public static int bugger(int num) {
        int count = 0;
        while(Integer.valueOf(num).toString().toCharArray().length > 1){
            int newNum = 1;
            for(char c : Integer.valueOf(num).toString().toCharArray()){
                newNum *= Integer.valueOf(String.valueOf(c));
            }
            num = newNum;
            count += 1;
        }
        return count;
    }
}