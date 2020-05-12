class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0 ;
        int h = nums.length -1 ;
        while (l < h)
        {
                int m = (l + h) / 2 ;

                if (m+1 <h && nums[m] != nums[m+1] && nums[m] != nums[m-1])
                    return nums[m] ; 
                
                else if( ((m & 1) == 0 && nums[m] == nums[m+1]) || ((m & 1) == 1 && nums[m] == nums[m-1]) )
                        l = m + 1; 
                else
                    h = m - 1 ; 
            }

            return nums[l] ; 
        }
    }
