class Solution {
    public int differenceOfSums(int n, int m) {
       int sum1=0;
       int sum2=0;
       for(int i=1;i<=n;i++){
        if(i%m==0)
        {
            sum1+=i;
        }
        else if(i%m!=0){
            sum2+=i;
        }
        System.out.print(sum2);
       } 
       return sum2-sum1;
    }
}