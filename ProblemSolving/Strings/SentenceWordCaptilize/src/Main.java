public class Main {
    public static void main(String[] args) {

        System.out.println(Capitalize("Hello world!"));
        System.out.println(Capitalize("  Today iss     Wednesday   "));
    }
    public static String Capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return "";
    String[] words = sentence
            .trim().replaceAll(" +"," ")
            .split(" ");
        for (int i = 0; i < words.length; i++) {
          words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        }
        return String.join(" ",words);
    }
}