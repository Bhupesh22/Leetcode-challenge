class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        num_zeroes = nums.count(0)
        nums[:] = [num for num in nums if num != 0]
        nums += [0] * num_zeroes