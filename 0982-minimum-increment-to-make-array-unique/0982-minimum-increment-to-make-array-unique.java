class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++){
            while (nums[i] <= nums[i-1]) {
                cnt += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return cnt;
    }
}