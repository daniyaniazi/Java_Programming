class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;


        for(int start=0;start<n;start++){

            if(gas[start]<cost[start]){
                continue;
            }

            int next= (start+1)%n;

            int currentGas = gas[start]-cost[start] + gas[next];

            while(next!=start){

                if(currentGas<cost[next]) break;

                int nextCost = cost[next];
                next= (next+1)%n;
                currentGas = currentGas-nextCost + gas[next];

            }
            if(next==start){
                return start;
            }
        }

        return -1;
    }
}