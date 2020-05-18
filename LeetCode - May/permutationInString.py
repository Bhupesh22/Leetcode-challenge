class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if(len(s1)>len(s2)):
            return False
        
        s1hash = [0 for i in range(26)]
        s2hash = [0 for i in range(26)]
        
        for i in range(len(s1)):
            s1hash[ord(s1[i])-ord('a')]+=1
            s2hash[ord(s2[i])-ord('a')]+=1
        
        if(s1hash == s2hash):
            return True
        
        start=0
        end=len(s1)
        while(end<len(s2)):
            
            s2hash[ord(s2[start])-ord('a')]-=1
            s2hash[ord(s2[end])-ord('a')]+=1
            
            if( s1hash == s2hash ):
                return True
            
            start+=1
            end+=1
        return False