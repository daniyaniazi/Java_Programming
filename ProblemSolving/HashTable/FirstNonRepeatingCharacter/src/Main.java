public class Main {
    public static void main(String[] args) {
        CharacterFinder finder = new CharacterFinder();
        char ch = finder.findFirstNonRepeatingCharacter("a green apple");
        System.out.println(ch);
        ch = finder.firstRepeatingChar("green apple");
        System.out.println(ch);
    }
}