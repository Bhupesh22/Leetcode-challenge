class Solution {
    public int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    public int maxSubArray(int[] nums) {
        int maxcurrent = nums[0];
        int maxsofar = nums[0];
        for( int i=1 ; i<nums.length ; i++){
            maxcurrent=max(nums[i],maxcurrent+nums[i]);
            maxsofar=max(maxcurrent,maxsofar);
        }
        return maxsofar;
    }
}