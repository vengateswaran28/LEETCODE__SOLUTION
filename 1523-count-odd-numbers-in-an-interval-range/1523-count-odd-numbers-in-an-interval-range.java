class Solution {
    public int countOdds(int low, int high) {
        int n=high-low;
        int sum=0;
        if(n%2==0 && high%2==1){
            sum= n/2;
            return sum+1;
        }
           else if(n%2==1){
            sum=n/2;
          return sum+1;
           }
           else
        return n/2;
    }
}