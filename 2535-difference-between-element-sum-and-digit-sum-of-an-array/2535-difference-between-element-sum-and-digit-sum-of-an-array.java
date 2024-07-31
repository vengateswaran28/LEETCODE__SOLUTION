class Solution {
    public int differenceOfSum(int[] n) {
        int nsum=0;
        int digit_sum=0;
        for(int i=0;i<n.length;i++){
           if(n[i]>0)
           nsum+=n[i];
           System.out.print(nsum);
        }

        for(int i=0;i<n.length;i++){
            int m=n[i];
            while(m>0){
                  int rem=m%10;
                digit_sum+=rem;
                m/=10;
            }
            System.out.print(digit_sum);
        }

        return Math.abs(nsum-digit_sum);
    }
}