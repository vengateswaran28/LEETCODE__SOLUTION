class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n/=10;
        }
        System.out.print(sum);
           System.out.print(product);
        return product-sum;
    }
}