class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        if(sum(gas)<sum(cost)){
            return -1;
        }
        int total = 0;

        int start=0;

        for(int i=0;i<gas.length;i++){
            total = total+gas[i]-cost[i];
            if(total<0){
                total =0;
                start=i+1;
            }
        }
        return start;
    }
    public int sum(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res+arr[i];
        }
        return res;
    }
}