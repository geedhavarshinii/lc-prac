class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        summ = 0
        n = len(numbers)
        i = 0
        j = n-1
        while i < n:
            summ = numbers[i] + numbers[j]
            if summ==target:
                return [i+1, j+1]
            elif summ < target:
                i+=1
            else:
                j-=1
        
