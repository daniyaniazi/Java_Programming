class Solution {
    int[][] arr= new int[5000][2];
    public int maxProfit(int[] prices) {
        int n = prices.length;

        return solve(prices,0,n,true);
    }

    public int solve(int[] prices, int day, int n , boolean buy){
        if(day>=n) return 0;
        int buyV;
        if (buy==true) buyV=0;
        else buyV=1;

        if(arr[day][buyV] > 0){
            return arr[day][buyV];
        }
        int profit=0;
        if(buy){
            int take= solve(prices,day+1,n,false) - prices[day];
            int not_take= solve(prices,day+1,n,true);
            profit = Math.max(profit,Math.max(take,not_take));
        }
        else{
            int sale=  prices[day] + solve(prices,day+2,n,true);
            int not_sale= solve(prices,day+1,n,false);
            profit = Math.max(profit,Math.max(sale,not_sale));
        }
        arr[day][buyV] = profit;
        return profit;
    }
}