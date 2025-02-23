class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = 1;
        int minProd = 1;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++){
            int temp = nums[i] * maxProd;
            maxProd = Math.max(nums[i], Math.max(nums[i]*maxProd, nums[i]*minProd));
            minProd = Math.min(nums[i], Math.min(temp, nums[i]*minProd));
            res = Math.max(res, Math.max(maxProd, minProd));
        }
        return res;
    }
}