class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        l = 0 ;
        h = len(nums) -1 ;

        while l < h:
        
            m = (l + h) // 2 ;
            if (m+1 <h and nums[m] != nums[m+1] and nums[m] != nums[m-1]):
                return nums[m]  

            elif( ((m & 1) == 0 and nums[m] == nums[m+1]) or ((m & 1) == 1 and nums[m] == nums[m-1]) ):
                l = m + 1 
            
            else:
                h = m - 1  
        
        return nums[l] 
        