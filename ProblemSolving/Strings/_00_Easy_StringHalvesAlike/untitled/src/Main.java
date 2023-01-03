class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String VOWELS = "aeiouAEIOU";

        for(int i = 0 , j = s.length() - 1 ; i <= j ; i++ , j--){
            if(VOWELS.indexOf(s.charAt(i)) != -1 ){
                count++;
            }
            if(VOWELS.indexOf(s.charAt(j)) != -1 ){
                count--;
            }
        }
        return count == 0;
    }
}