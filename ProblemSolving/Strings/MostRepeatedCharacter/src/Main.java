import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMostRepeatedChr("My Proogram is noot woorking"));
        System.out.println(getMaxChar("My Proogram is noot woorking"));
    }
    public  static  char getMostRepeatedChr(String str){
        if (str.isEmpty() || str == null) throw new IllegalArgumentException();
        Map<Character , Integer> fre = new HashMap<>();
        for (Character ch : str.toCharArray()){
            if(fre.containsKey(ch)){
                fre.replace(ch, fre.get(ch)+1);

            }else {
                fre.put(ch,1);
            }
        }
        Character maxCh=str.toCharArray()[0];
        for (Map.Entry<Character, Integer> set :fre.entrySet()) {
//            System.out.println(set.getKey() + " = "
//                    + set.getValue());
            if (set.getValue() > fre.get(maxCh)){
                maxCh = set.getKey();
            }
        }
        return  maxCh;
    }

    public static  char getMaxChar(String str){
        if (str.isEmpty() || str == null) throw new IllegalArgumentException();
        final  int ASCII_SIZE = 256;
        int[] freq = new int[ASCII_SIZE];
        for (Character ch : str.toCharArray()){
            freq[ch]++;// "c"->43

        }
        int max =0;
        char result = ' ';
        for( int i=0 ; i<freq.length;i++){
            if (freq[i] > max){
                max = freq[i];
                result = (char) i;
            }
        }
        return  result;
    }
}