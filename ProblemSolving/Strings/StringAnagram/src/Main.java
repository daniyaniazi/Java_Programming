import java.util.Arrays;

/*
@notice Problem Link -> https://leetcode.com/problems/valid-anagram/submissions/
*/
public class Main {
    public static void main(String[] args) {

        System.out.println(areAnagram("Hello world!"," world! Hello"));
    }
    // O(n log n)
    public static boolean areAnagram (String str1, String str2){
        if(str1==null || str2==null || str2.length() != str1.length())  return  false;
        // O(n)
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();
        // O(n log n)
        Arrays.sort(array1);
        Arrays.sort(array2);

        return  Arrays.equals(array1,array2);
    }
    public static boolean areAnagram2 (String str1, String str2){
        if(str1==null || str2==null || str2.length() != str1.length())  return  false;
        final int  ENGLISH_ALPHABETS=26;
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        int[] frequencies = new int[26];
        // O(n)
        for (int i = 0; i <str1.length() ; i++) {
            frequencies[str1.charAt(i)-'a']++;
        }
        // O(n)
        for (int i = 0; i <str2.length() ; i++) {
            if(frequencies[str2.charAt(i)-'a']==0)
                return  false;
            frequencies[str2.charAt(i)-'a']--;
        }
        return true;
    }
}
