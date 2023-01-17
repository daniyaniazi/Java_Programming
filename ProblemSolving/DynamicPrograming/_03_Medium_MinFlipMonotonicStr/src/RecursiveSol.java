class Solution {
    int n;
    public int minFlipsMonoIncr(String s) {
        n = s.length();
        int[][] mem = new int[s.length()+1][2];

        return solve(s,0,0);

    }
    public int solve(String s,int index,int prev){
        if(index >=n ){
            return 0;
        }
        int flip = Integer.MAX_VALUE;
        int no_flip = Integer.MAX_VALUE;

        if(s.charAt(index) == '0'){
            if(prev == 1){
                flip = 1 + solve(s,index+1,1);
            }else{
                flip = 1 + solve(s,index+1,1);
                no_flip =  solve(s,index+1,0);
            }
        }
        else if(s.charAt(index)=='1'){
            if(prev == 1){
                no_flip =  solve(s,index+1,1);
            }else{
                flip = 1 + solve(s,index+1,0);
                no_flip =  solve(s,index+1,1);
            }
        }
        return Math.min(flip,no_flip);
    }
}