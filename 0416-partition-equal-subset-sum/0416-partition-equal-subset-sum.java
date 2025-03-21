class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum%2 != 0) return false;
        sum /= 2;
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= sum; j++){
                if (j==0) dp[i][0] = true;
                else if (i==0) dp[0][j] = false;
                else if (nums[i-1] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
            }
        }
        return dp[n][sum];
    }
}