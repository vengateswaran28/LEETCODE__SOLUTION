
        class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left []=new int[nums.length];
        int right []=new int [nums.length];
         left[0]=0;
         right[0]=0;
        int sum1=nums[0];
        int sum2=nums[nums.length-1];
        for( int i=1; i<nums.length; i++)
        {
            
            left[i]=sum1;
            sum1+=nums[i];
           
            right[nums.length-1-i]=sum2;
            sum2+=nums[nums.length-1-i];

        }

        for( int i=0; i<nums.length; i++)
        {
            nums[i]=Math.abs(left[i]-right[i]);
        }
        return nums;
     
    }
}