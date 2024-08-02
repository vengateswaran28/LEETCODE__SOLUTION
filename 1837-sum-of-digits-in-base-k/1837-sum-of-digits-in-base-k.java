class Solution {
    public int sumBase(int n, int k) {
        int sum=0;

        if(k==10){
            while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
        }
    
            while(n>0){
           int re=n%k;
           sum+=re;
             n=n/k;
            }
        
        return sum;
    }
}