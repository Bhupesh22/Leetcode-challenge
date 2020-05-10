class Solution:
    def checkValidString(self, s: str) -> bool:
        stack, star = [], []
        
        for index, char in enumerate(s):
            if char == '(':
                stack.append(index)
            elif char == "*":
                star.append(index)
            elif char == ')':
                if len(stack)>0:
                    stack.pop()
                elif len(star)>0:
                    star.pop()
                else:
                    return False
        
        while stack :
            if(star and (stack[-1] < star[-1]) ):
                star.pop()
            else:
                return False
            stack.pop()
        return len(stack)==0