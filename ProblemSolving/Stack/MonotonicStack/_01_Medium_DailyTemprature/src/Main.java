class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // MONOTONIC STACK
        Stack<Integer> stack = new Stack();
        int[] res = new int[temperatures.length];
        for (int i=temperatures.length-1 ; i>=0;i--){
            while(!stack.empty() &&temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.empty()){
                res[i] = 0;
            }
            else{
                res[i]  = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}