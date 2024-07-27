class Solution {
    public int buyChoco(int[] p, int m) {
        Arrays.sort(p);
       if(p[0]+p[1]<=m){
        return (p[0]+p[1])-m;
       } 
       else{
       return m;
       }
    }
}