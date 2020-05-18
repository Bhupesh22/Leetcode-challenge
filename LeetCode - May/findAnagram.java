class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int m = s.length();
        int n = p.length();
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        if(m < n)
            return ans;
        
        int[] phash = new int[26]; 
        int[] shash = new int[26]; 
        
        for(int i=0;i<n;i++){
            phash[p.charAt(i)-'a']++; 
            shash[s.charAt(i)-'a']++; 
        }
        
        for(int i=n;i<m;i++){
            if(Arrays.equals( phash , shash )) 
                ans.add(i-n); 
            
            shash[s.charAt(i-n)-'a']--; 
            shash[s.charAt(i)-'a']++; 
        }
        
        if(Arrays.equals( phash , shash ))
            ans.add(m-n); 
            
        return ans;
    }
}