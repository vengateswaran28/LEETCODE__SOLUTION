class Solution {
    public int countDigits(int num) {
       int temp= num;
       int c=0;
       while(temp>0){
        int  rem=temp%10;
           temp/=10;
        if(num%rem==0)
            c++;
        
       }
       return c;
    }
}