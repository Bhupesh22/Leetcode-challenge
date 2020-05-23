class Solution {
    public String frequencySort(String s) {
        //String s = "tree";
		
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		for(char c: s.toCharArray()) {
			hash.put(c,hash.getOrDefault(c, 0)+1);
		}
		
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b)-> hash.get(b)-hash.get(a));
		heap.addAll(hash.keySet());
		
		StringBuilder sb = new StringBuilder();
        while(heap.size() > 0){
            char c = heap.remove();
            for(int i = 0 ; i < hash.get(c); i++){
                sb.append(c);
            }
        }
        return new String(sb);
    }
}