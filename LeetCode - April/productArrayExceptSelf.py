class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        left=[1 for i in range(len(nums))]
        right=[1 for i in range(len(nums))]
        
        for i in range(len(nums)-1):
            left[i+1] = left[i]*nums[i]
        
        for j in range(len(nums)-2,-1,-1):
            right[j]=right[j+1]*nums[j+1]
         
        res=[a*b for a,b in zip(left,right)]
        
        return res