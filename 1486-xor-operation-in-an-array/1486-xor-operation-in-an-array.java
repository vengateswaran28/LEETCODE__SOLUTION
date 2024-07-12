class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
         int nums[]=new int[n];
         int j=start;
         for(int i=0;i<nums.length;i++){
            nums[i]=j;
            j+=2;
         }
         for(int i=0;i<nums.length;i++){
            //System.out.print(nums[i]);
            ans^=nums[i];
         }
         return ans;
    }
}