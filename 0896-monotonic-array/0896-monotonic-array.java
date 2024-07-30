class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increment=true;
            boolean decrement=true;
            for(imt i=0;i<length-1;i++){
                if(nums[i] <= nums[i+1])
                increment=false;
                if(nums[i] >= nums[i+1])
                    decrement=false;
                
            }
            return (increment || decrement);
    }
}