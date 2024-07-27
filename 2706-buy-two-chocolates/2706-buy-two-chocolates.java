class Solution {
    public int buyChoco(int[] p, int m) {
        Arrays.sort(p);
       if(p[0]+p[1]<=m){
        return m-(p[0]+p[1]);
       } 
       else{
       return m;
       }
    }
}