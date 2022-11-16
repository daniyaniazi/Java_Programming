class Solution {


    /// @title Reverse A Number
    /// @author Daniyan
    /// @dev Leetcode Link -> https://leetcode.com/problems/reverse-integer/
    public int reverse(int x) {
        int remainingNumber ;
        if(x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE){
            return 0;
        }
        if(x==0){
            return x;
        }
        remainingNumber = Math.abs(x);
        String reverseStr = "";

        while (remainingNumber > 0){
            int reverseNumber = remainingNumber % 10;
            reverseStr = reverseStr + Integer.toString(reverseNumber);
            remainingNumber = remainingNumber / 10;
        }
        System.out.println(reverseStr);
        if(Long.parseLong(reverseStr) > Integer.MAX_VALUE || Long.parseLong(reverseStr)             < Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return -Integer.parseInt(reverseStr);
        }
        return Integer.parseInt(reverseStr);
    }
}