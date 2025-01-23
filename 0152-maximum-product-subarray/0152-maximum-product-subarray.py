class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxProduct = 1
        minProduct = 1
        result = nums[0]
        for i in range(0, len(nums)):
            temp = nums[i]*maxProduct
            maxProduct = max(nums[i], max(nums[i]*maxProduct, nums[i]*minProduct))
            minProduct = min(nums[i], min(temp, nums[i]*minProduct))
            result = max(result, max(maxProduct, minProduct))
        return result
