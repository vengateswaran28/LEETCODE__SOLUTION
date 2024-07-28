class Solution {
    public boolean canAliceWin(int[] n) {
        int s1=0;
        int s2=0;

        for(int i=0;i<n.length;i++){
            if(n[i]<10){
                s1+=n[i];
            }
            else{
                s2+=n[i];
            }
        }
            if(s1>s2||s2>s1){
                return true;
            }
        return false;
    }
};