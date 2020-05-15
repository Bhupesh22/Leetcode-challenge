class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        maxcurrent = nums[0]
        maxsofar = nums[0]
        mincurrent = nums[0]
        minsofar = nums[0]

        for i in range(1,len(nums)):
            maxcurrent = max(nums[i], maxcurrent+nums[i])
            maxsofar = max(maxcurrent, maxsofar)
            mincurrent = min(nums[i], mincurrent+nums[i])
            minsofar = min(mincurrent, minsofar)
        
        if minsofar == sum(nums):
            return maxsofar
        else:
            return max(maxsofar,sum(nums)-minsofar)
        
        