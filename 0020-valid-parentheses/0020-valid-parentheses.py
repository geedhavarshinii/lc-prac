class Solution:
    def isValid(self, s: str) -> bool:
        stk = []
        hmap = {'}':'{', ']':'[', ')':'('}

        for char in s:
            if char in hmap.values():
                stk.append(char)
            elif char in hmap.keys():
                if not stk or hmap[char]!=stk.pop():
                    return False
        return not stk
