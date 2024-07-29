class Solution {
    public int findComplement(int num) {
        if(num<2){
            return 0;
        }
        if((num&1)!=0)
            return num>>=1; 
        return 1;
    }
}