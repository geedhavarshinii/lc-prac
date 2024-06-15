class Solution {
    public int search(int[] nums, int target) {
        int cnt = 0;
        for (int i : nums){
            cnt++;
            if (i == target) return cnt - 1;
        }
        return -1;
    }
}