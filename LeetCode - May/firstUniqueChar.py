class Solution:
    def firstUniqChar(self, s: str) -> int:
        counter={}
        for i in s:
            counter[i]=counter.get(i,0)+1
        
        for i in s:
            if(counter[i]==1):
                return s.index(i)
        return -1
            

        