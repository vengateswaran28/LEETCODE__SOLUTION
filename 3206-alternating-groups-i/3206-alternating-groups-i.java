class Solution {
    public int numberOfAlternatingGroups(int[] c) {
        int n = c.length;
        int count=0;
        if(c[n-1]!=c[0] && c[0]!=c[1]){
            count++;
        }
        if(c[n-1]!=c[0] && c[n-1]!=c[n-2]){
            count++;
        }
        for(int i=1;i<n-1;i++){
            if(c[i]!=c[i-1] && c[i]!=c[i+1]){
                count++;
            }
        }
        return count;
    }
}