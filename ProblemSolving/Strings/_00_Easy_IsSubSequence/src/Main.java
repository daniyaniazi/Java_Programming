//https://leetcode.com/problems/is-subsequence/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()<=0 ) return true;
        if(s.equals(t)) return true;
        String str="";
        int count=0;
        for(int i = 0;i< t.length() && count < s.length() ;i++){
            if(t.charAt(i) == s.charAt(count)){
                str= str+t.charAt(i);
                count++;
            }
        }
        return s.equals(str);
    }
}