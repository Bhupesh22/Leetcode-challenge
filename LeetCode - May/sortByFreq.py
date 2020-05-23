class Solution:
    def frequencySort(self, s: str) -> str:
        dictx = {}
        for i in s:
            dictx[i] = dictx.get(i, 0)+1
        z = sorted(dictx.items(), key=lambda x:x[1], reverse = True)
        res = ""
        for i, j in z:
            for g in range(j):
                res = res + i
        return res