class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int last=nums[len-1]-1;
        int secondLast=nums[len-2]-1;
        int result=(last)*(secondLast);
        return result;
    }
}