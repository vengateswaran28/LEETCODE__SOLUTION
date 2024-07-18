class Solution {
    public boolean isHappy(int n) {
       int  m, result = 0;
       int c=0;
    while (c<=8) {
        result = 0;
        while (n > 0) {
            m = n % 10;
            n /= 10;
            result += m*m;
        }
     n=result;
    c++;
        if (result==1)
        {
            return true;
        
        }
    }
    return false;
    }
}