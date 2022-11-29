public class Main {
    public static void main(String[] args) {
        System.out.println((Main.reverseStr("Hello world!")));
    }
public static String reverseStr(String str){
        if (str==null) return "";
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length()-1;i>=0;i--){ // O(n)
            reverse.append(str.charAt(i)); // O(1)
        }
        return  reverse.toString();
}
}