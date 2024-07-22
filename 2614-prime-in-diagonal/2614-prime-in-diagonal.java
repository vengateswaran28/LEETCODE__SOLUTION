class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                ans = Math.max(ans, nums[i][i]);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (isPrime(nums[n - i - 1][i])) {
                ans = Math.max(ans, nums[n - i - 1][i]);
            }
        }
        return ans;
    }
    
    private boolean isPrime(int n) {
    
        if (n <= 1) {
            return false; 
    
        }
                for (int i = 2; i <= Math.sqrt(n); i++) {
            
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}