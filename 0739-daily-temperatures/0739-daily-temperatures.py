class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        ans = [0] * len(temperatures)
        stk = []
        for i, temp in enumerate(temperatures):
            while (stk and temperatures[stk[-1]] < temp):
                index = stk.pop()
                ans[index] = i - index
            stk.append(i)
        return ans
        