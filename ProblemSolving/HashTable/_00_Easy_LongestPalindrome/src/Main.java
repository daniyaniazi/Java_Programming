class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();
        char[] array = s.toCharArray();
        for(char ch:array){
            if(map.get(ch)!=null)  map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        boolean isOdd = false;
        int max=0;
        for (Map.Entry<Character,Integer> item : map.entrySet()) {
            if( item.getValue() %2==0)  max = max +  item.getValue();
            else{
                max = max + item.getValue()-1;
                isOdd = true;
            }
        }
        if(isOdd) max++;
        return max;

    }
}