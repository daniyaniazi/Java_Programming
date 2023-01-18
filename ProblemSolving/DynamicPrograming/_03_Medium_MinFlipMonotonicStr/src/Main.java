class Solution {
    public int minFlipsMonoIncr(String s) {
        int count_of_ones = 0;
        int flips =0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                count_of_ones++;
            }
            else{
                flips = Math.min(flips+1,count_of_ones);
            }
        }

        return flips;
    }
}