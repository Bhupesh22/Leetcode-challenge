class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        dictx={}
        for i in nums:
            dictx[i]=dictx.get(i,0)+1
        
        for i in dictx.keys():
            if dictx[i]>=len(nums)/2:
                return i