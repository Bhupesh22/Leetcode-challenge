class Solution {
    public int majorityElement(int[] nums) {
        
        int ans=0;
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        
        for( int i=0; i<nums.length; i++){
            counter.put(nums[i], counter.getOrDefault(nums[i],0)+1);
        }
        
        for( int x: counter.keySet()){
            if( counter.get(x) > nums.length/2){
                ans=x;
            }
        }
        return ans;
    }
}