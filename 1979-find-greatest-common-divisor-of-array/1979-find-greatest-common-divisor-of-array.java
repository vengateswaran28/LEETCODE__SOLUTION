class Solution {
    public int findGCD(int[] nums) {
        int len=nums.length;
       Arrays.sort(nums);
       int start=nums[0];
       int end=nums[len-1];
       int max=0;
       for(int i=1;i<200000;i++){
        if(start%i==0 && end%i==0){
            max=i;
        }
       
       } 
       return max;
    }
}