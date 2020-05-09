class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
    
        counts = { 0: -1}
        count=0
        max_length = 0
        
        for i in range(len(nums)):
            if nums[i]:
                count=count+1
            else:
                count=count-1
            
            if count in counts:
                max_length=max(max_length, i-counts[count])
            else:
                counts[count]=i
        
        return max_length