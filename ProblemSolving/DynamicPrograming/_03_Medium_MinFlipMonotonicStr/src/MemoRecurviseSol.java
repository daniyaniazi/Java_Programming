class Solution {
    int n;
    int[][] mem;
    public int minFlipsMonoIncr(String s) {
        n = s.length();
        mem = new int[s.length()+1][2];
        for (int[] row: mem)  Arrays.fill(row, -1);
        return solve(s,0,0);

    }
    public int solve(String s,int index,int prev){
        if(index >=n ){
            return 0;
        }
        if(mem[index][prev] != -1) return mem[index][prev];
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
        mem[index][prev] = Math.min(flip,no_flip);
        return Math.min(flip,no_flip);
    }
}