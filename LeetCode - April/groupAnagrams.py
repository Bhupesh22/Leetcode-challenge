class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        solution={}
        for i in strs:
            temp="".join(sorted(i))
            if temp in solution:
                solution[temp].append(i)
            else:
                solution[temp]=[i]
        return solution.values()
                