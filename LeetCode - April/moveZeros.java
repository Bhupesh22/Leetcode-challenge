class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0, count = 0;
        
        while( j< nums.length && i<=j ){
            if( nums[j] == 0 ){
                count++;
				j++;
            }
            else{
                nums[i] = nums[j];
                i++;
				j++;
            }
        }
        for( i=i; count>0; count--, i++ )
            nums[i] = 0; 
        
    }
}