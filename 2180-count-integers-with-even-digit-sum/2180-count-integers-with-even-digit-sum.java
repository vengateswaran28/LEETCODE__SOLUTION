class Solution {
    public int countEven(int num) {
        int c=0;
        int sum;
        for(int i=1;i<=num;i++){
            sum=0;
            int j=i;
            while(j>0){
                int rem=j%10;
                sum+=rem;
                j/=10;
            }
           if(sum%2==0)
            c++;
           
        }
        return c;
    }
}