class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, (int)1e9);
        dp[0] = 0;

        for (int coin : coins){
            for (int j = coin; j <= amount; j++){
                dp[j] = Math.min(dp[j], dp[j-coin]+1);
            }
        }
        return dp[amount] >= (int)1e9 ? -1 : dp[amount];
    }
}