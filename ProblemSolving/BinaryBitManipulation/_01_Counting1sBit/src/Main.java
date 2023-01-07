public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;

        while(n!=0){
            int ans= n%2;
            if(ans==1) count++;
            n= n>>1;
        }
        return count;
    }
}