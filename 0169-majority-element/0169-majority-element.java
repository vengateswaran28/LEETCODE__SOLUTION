class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int max= 0;
        int ans=-1;
        while(j<nums.length){
            int x= nums[i];
            if(nums[j]==nums[i]){
                if(max<=j-i+1){
                    max= j-i+1;
                    ans= x;
                }
                j++;
            }else{
                i=j;
            }
        }
        return ans;
    }
}