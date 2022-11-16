class Solution {
    public int reverse(int x) {
        int remainingNumber =x;
        String reverseStr = "";

        while (remainingNumber>0){
            int reverseNumber = remainingNumber % 10;
            reverseStr = reverseStr + Integer.toString(reverseNumber);
            remainingNumber = remainingNumber / 10;
        }
        return Integer.parseInt(reverseStr);
    }
}