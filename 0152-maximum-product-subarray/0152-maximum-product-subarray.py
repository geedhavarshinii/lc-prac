class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        pre, suf = 1, 1
        res = -(inf)
        n = len(nums)
        for i in range(0, n):
            if (pre==0): pre = 1
            if (suf==0): suf = 1
            pre *= nums[i]
            suf *= nums[n-i-1]
            res = max(res, pre, suf)
        return res
            