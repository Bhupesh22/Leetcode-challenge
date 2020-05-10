class Solution:
    def findJudge(self, N: int, trust: List[List[int]]) -> int:
        
        count=[0 for i in range(N+1)]
        for i in trust:
            count[i[0]]-=1
            count[i[1]]+=1
        
        for i in range(1,N+1):
            if count[i]==N-1:
                return i
        return -1
     