class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x>0||x<0){
            int rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        return sum;
    }
}