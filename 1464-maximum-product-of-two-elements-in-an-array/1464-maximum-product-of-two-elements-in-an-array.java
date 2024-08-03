class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int last=nums[len-1];
        int secondLast=nums[len-2];
        int result=(last-1)*(secondLast-1);
        return result;
    }
}