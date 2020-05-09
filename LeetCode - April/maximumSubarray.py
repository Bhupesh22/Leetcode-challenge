class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxcurrent=nums[0]
        maxsofar=nums[0]
        for i in range(1,len(nums)):
            maxcurrent=max(nums[i],maxcurrent+nums[i])
            maxsofar=max(maxcurrent,maxsofar)
        return maxsofar    