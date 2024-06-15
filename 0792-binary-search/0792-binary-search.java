class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while (l <= r){
            mid = l + (r - l) / 2;
            if (nums[mid] > target) r = mid - 1;
            else if (target > nums[mid]) l = mid + 1;
            else return mid;
        }
        return -1;
    }
}