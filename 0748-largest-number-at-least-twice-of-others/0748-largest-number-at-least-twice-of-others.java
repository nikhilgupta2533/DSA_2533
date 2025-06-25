class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int index = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(max<nums[i])
            {
            smax = max;
            max = nums[i];
            index = i;
            }
            else if(smax<nums[i])
            {
                smax = nums[i];
            }
        }
        if(2*smax<=max)
        {
            return index;
        }
        else
        {
            return -1;
        }
    }
}