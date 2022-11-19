public class Easy_01_reversetring_in_place {

    public void reverseString(char[] s) {

        for(int i = 0 ;i<s.length-i;i++){
            char temp=s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}

// https://leetcode.com/problems/reverse-string/

