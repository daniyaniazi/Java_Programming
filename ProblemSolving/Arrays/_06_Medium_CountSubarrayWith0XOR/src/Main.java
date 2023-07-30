public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int max=0;
        int xor =0;
        HashMap<Integer, Integer> xorMap = new HashMap<>();
        
        xorMap.put(0, 1);
        
        for(int i=0;i<a.length;i++){
            xor = xor ^ a[i];
            int x = xor ^ b;
            if(xorMap.get(x)!=null){
                max += xorMap.get(x);
            }
            if(xorMap.containsKey(xor)){
                xorMap.put(xor, xorMap.get(xor)+1);
            }else {
                xorMap.put(xor, 1);
            }
        }
        return max;
    }
}