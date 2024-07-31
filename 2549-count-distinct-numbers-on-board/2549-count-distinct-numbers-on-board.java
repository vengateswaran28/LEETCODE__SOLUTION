class Solution {
    public int distinctIntegers(int n) {
        int c=0;
        int b=0;
        for(int i=2;i<=n;i++){
            if(n%i==1)
            c++;
        
        else
        b++;
        }
        return c+b;
    }
}