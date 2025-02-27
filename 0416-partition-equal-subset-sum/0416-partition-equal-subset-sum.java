class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i : nums) sum+=i;
        if (sum%2 != 0) return false;
        sum/=2;
        boolean dp[] = new boolean[sum+1];
        dp[0] = true;
        for (int num : nums){
            for (int j = sum; j >= num; j--){
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[sum];
    }
}