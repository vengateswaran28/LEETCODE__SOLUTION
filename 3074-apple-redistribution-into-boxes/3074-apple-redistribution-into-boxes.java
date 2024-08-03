class Solution {
    public int minimumBoxes(int[] a, int[] c) {
        int sum=0;
        for(int i=0;i<a.length;i++){
        sum+=a[i];
        }
        int m=0;
        Arrays.sort(c);
        for(int i=c.length-1;i>=0;i--){
            if(sum<=0){
               return m;
            }
           sum-=c[i];
           m++;
        }
        return m;
    }
}