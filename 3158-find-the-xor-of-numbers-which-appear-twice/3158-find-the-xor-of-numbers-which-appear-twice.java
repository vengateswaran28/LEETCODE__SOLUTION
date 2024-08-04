class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=0;
        int count;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            count=0;
          if(nums[i]==nums[i+1]){
            count++;
          }
          if(count>0){
            n^=nums[i];
          }
        }
        //System.out.print(n^m);
        return n;
    }
}