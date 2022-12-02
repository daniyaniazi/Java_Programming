// @notice Problem Link -> https://leetcode.com/problems/group-anagrams

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> wordMap = new HashMap();
        for (String strTemp : strs)
        {
            char charArray[] = strTemp.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(wordMap.containsKey(sortedStr))
            {wordMap.get(sortedStr).add(strTemp);}
            else{
                wordMap.put(sortedStr,new ArrayList<String>(Arrays.asList(strTemp)));
            }
        }
        res.addAll(wordMap.values());
        return res;
    }

}