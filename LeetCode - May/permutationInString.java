class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) 
			return false;
        
        int[] s1hash = new int[26];
        int[] s2hash = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            s1hash[s1.charAt(i) - 'a']++;
            s2hash[s2.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(s1hash, s2hash)) 
			return true;
        
        int start = 0;
        int end = s1.length();
        
		while(end < s2.length()){
            s2hash[s2.charAt(start) - 'a']--;
            s2hash[s2.charAt(end) - 'a']++;
            
            if(Arrays.equals(s1hash, s2hash)) 
				return true;
            start++;
            end++;
        }
        return false;      

        
        
    }
} 