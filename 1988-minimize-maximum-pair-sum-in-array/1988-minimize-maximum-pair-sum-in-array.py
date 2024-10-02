class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        max_sum = float(-inf)
        n = len(nums)
        i, j = 0, n-1
        while i < j:
            pair_sum = nums[i]+nums[j]
            max_sum = max(max_sum, pair_sum)
            i+=1
            j-=1
        return max_sum