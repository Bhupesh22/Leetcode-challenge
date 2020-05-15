class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxcurrent = nums[0];
        int maxsofar = nums[0];
        int mincurrent = nums[0];
        int minsofar = nums[0];
        for(int i=1; i<nums.length; i++){
            maxcurrent = Math.max(nums[i], maxcurrent+nums[i]);
            maxsofar =Math.max(maxsofar, maxcurrent);
            mincurrent = Math.min(nums[i], mincurrent+nums[i]);
            minsofar = Math.min(minsofar, mincurrent);
        }
        int sum = Arrays.stream(nums).sum();
        if(minsofar == sum)
            return maxsofar;
        else
            return Math.max(maxsofar,sum-minsofar);
    }
}