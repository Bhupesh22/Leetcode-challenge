class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []

        if len(num) == k: 
            return "0"

        for i in range(len(num)):
            while k and stack and stack[-1] > num[i]:
                stack.pop()
                k -= 1
            stack.append(num[i])


        while k:
            stack.pop()
            k -= 1

        return "".join(stack).lstrip('0') or "0"