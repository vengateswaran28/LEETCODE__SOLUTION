class Solution {
    public int maxProductDifference(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int m=nums[0]*nums[1];
        System.out.print(m);
        int n=nums[len-2]*nums[len-1];
        return n-m;
    }
}