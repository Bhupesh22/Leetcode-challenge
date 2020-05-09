import math
class Solution:
    def findComplement(self, num: int) -> int:
        bit = 0
        remain = num
        while remain:
            bit = bit << 1
            bit = bit ^ 1
            remain = remain >> 1
        return bit ^ num