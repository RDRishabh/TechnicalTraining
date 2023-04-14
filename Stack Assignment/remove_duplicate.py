class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        st = []
        l = {char: i for i, char in enumerate(s)}
        for i, char in enumerate(s):
            if char in st:
                continue
            while st and char < st[-1] and i < l[st[-1]]:
                st.pop()  
            st.append(char)
        return ''.join(st)

#Link:- https://leetcode.com/problems/remove-duplicate-letters/description/