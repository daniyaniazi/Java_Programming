public class Main {
    public static void main(String[] args) {
        System.out.println((Main.reverseWords("Hello world!")));
    }
    public static String reverseWords(String str){
        if (str==null) return "";
        String[] words = str.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length-1;i>=0;i--){
            reverse.append(words[i]+" ");
        }
        // trim to remive extra white space
        return  reverse.toString().trim();
    }
}