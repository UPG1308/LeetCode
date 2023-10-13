class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        return func(cost.length, cost);
    }
    public int func(int ind, int[] cost){
        if(ind < 0) return 0;
        if(ind == 0) return cost[ind];
        if(dp[ind] != -1) return dp[ind];
        int one = 1000_000;
        int two = 1000_000;
        if(ind == cost.length){
            one = func(ind - 1, cost);
            two = func(ind - 2, cost);
        }
        else{
            one = cost[ind] + func(ind - 1, cost);
            two = cost[ind] + func(ind - 2, cost);
        }
        return dp[ind] = Math.min(one, two);
    }
}
