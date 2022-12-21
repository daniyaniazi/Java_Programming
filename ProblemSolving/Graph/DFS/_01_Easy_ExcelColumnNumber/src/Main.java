class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;

        for(int i=0; i<columnTitle.length(); i++)
        {
            int asciiValue = columnTitle.charAt(i) - 'A'+1;
            res = res*26 + asciiValue;
        }

        return res;
    }
}