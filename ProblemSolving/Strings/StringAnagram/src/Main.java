import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(areAnagram("Hello world!"," world! Hello"));
    }
    public static boolean areAnagram (String str1, String str2){
        if(str1==null || str2==null || str2.length() != str1.length())  return  false;
        char[] array1 = str1.toLowerCase().toCharArray();
;        char[] array2 = str1.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return  Arrays.equals(array1,array2);
    }
}
