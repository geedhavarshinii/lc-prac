class Solution {
    public int maxProduct(int[] nums) {
        double pre = 1, suf = 1;
        double ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            pre = pre==0 ? 1 : pre;
            suf = suf==0 ? 1 : suf;

            pre *= nums[i];
            suf *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suf));
        }
        return (int)ans;
    }
}