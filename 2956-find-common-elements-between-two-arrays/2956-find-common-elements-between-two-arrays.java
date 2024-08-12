class Solution {
    public int[] findIntersectionValues(int[] n1, int[] n2) {
        int a[]= new int[2];
        int c1=0;
        int c2=0;
        for(int i=0;i<n1.length;i++){
          for(int j=0;j<n2.length;j++){
            if(n1[i]==n2[j]){
            c1++;
            break;
            }
          }
        }
         for(int i=0;i<n2.length;i++){
          for(int j=0;j<n1.length;j++){
            if(n1[i]==n2[j]){

             c2++;
            break;
            }
          }
         }
        return new int[]{c1,c2};
    }
}