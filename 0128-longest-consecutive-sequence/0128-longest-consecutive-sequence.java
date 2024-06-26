class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        if (n==0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        for (int i : set){
            if (!set.contains(i-1)){
                int cnt = 1;
                int x = i;
                while (set.contains(x+1)){
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}