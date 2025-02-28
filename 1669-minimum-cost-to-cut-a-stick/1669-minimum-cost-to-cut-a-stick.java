class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int m = cuts.length;
        int[] allCuts = new int[m+2];
        allCuts[0] = 0;
        allCuts[m+1] = n;
        for (int i = 0; i < m; i++) allCuts[i+1] = cuts[i];

        int[][] dp = new int[m+2][m+2];
        
        return solve(0, m+1, allCuts, dp);
    }
    int solve(int left, int right, int[] cuts, int[][] dp){
        if (right - left == 1) return 0;
        if (dp[left][right]!=0) return dp[left][right];
        int minCost = Integer.MAX_VALUE;
        for (int i = left+1; i < right; i++){
            int cost = cuts[right] - cuts[left] + solve(left, i, cuts, dp) + solve(i, right, cuts, dp);
            minCost = Math.min(minCost, cost);
        } 
        return dp[left][right] = minCost;
    }
}