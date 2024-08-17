class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        ans = ''
        for c in s:
            for x in c:
                if x.isalnum():
                    ans +=x
        if ans==ans[::-1]:           
            return True
        return False