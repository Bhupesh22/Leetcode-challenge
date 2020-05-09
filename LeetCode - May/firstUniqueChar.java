class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        HashMap<Character, Integer> counter = new HashMap<>();

        for(int x = 0; x < s.length(); x++){
            counter.put(s.charAt(x), counter.getOrDefault(s.charAt(x),0) + 1);
        }

        for (int x = 0; x < s.length(); x++) {
            char i = s.charAt(x);
            if(counter.get(i) == 1){
                return s.indexOf(i); 
            }
        }

        return -1;
    }
}