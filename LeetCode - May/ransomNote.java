class Solution {
    public int count(String s , char c){
        char temp[]=s.toCharArray();
        int count=0;
        for(int i=0 ; i < s.length() ; i++){
            if(c == temp[i]){
                count=count+1;
            }
        }
        return count;
    }
    
    public boolean canConstruct(String ransomNote, String magazine) {
        

        char ransomarray [] = ransomNote.toCharArray();
        HashSet<Character> ransomset = new HashSet<Character>();
        
        for( int i=0 ; i < ransomarray.length ; i++){
            ransomset.add(ransomarray[i]);
        }
        
        int flag=1;
        Iterator<Character> itr = ransomset.iterator();
        while(itr.hasNext()){
            char letter = itr.next();
            if ( count(ransomNote,letter) > count(magazine,letter)){
                flag=0;
                break;
            }
        }
        
        if(flag==1) return true;
        else return false;
        
        
        
    }
}