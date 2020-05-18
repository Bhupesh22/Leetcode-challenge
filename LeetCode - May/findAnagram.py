class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        
        m=len(s)
        n=len(p)
        answer=[]
        
        if( m==0 or m < n):
            return answer
        
        shash = [0 for i in range(26)]
        phash = [0 for i in range(26)]
        
        for i in range(n):
            shash[ord(s[i])-ord('a')]+=1
            phash[ord(p[i])-ord('a')]+=1
        
        for i in range(n,m):
            if( shash == phash ):
                answer.append(i-n)
            shash[ord(s[i-n])-ord('a')]-=1
            shash[ord(s[i])-ord('a')]+=1
        
        if( shash == phash ):
            answer.append(m-n)
        return answer
            