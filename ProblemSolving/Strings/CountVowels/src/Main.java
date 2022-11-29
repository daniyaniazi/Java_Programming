public class Main {
    public static void main(String[] args) {
        System.out.println(Main.countVowels("Hello World"));

    }

    public static  int countVowels(String str){
        if (str==null) return 0;
        int count =0;
        String vowels = "aeiou";
        for (Character ch: str.toLowerCase().toCharArray()) {
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}