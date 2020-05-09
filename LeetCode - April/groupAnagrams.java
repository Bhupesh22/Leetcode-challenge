import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> solution = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++){
            
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedtemp = String.valueOf(temp);
            
            if (!solution.containsKey(sortedtemp)){
                solution.put(sortedtemp,new ArrayList<>());
            }
            solution.get(sortedtemp).add(strs[i]);
        }
        return new ArrayList(solution.values());
    }
}