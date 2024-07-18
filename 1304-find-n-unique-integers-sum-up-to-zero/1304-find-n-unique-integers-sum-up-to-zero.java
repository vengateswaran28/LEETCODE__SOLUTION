
class Solution {
    public int[] sumZero(int n) {
        int r[]= new int[n];
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            r[i] = i+1;
            sum += r[i];
        }
        r[n - 1] = -1 * sum;
        return r;
    }

}