class Solution {
    public int[] rowAndMaximumOnes(int[][] m) {
    int row=0;
    int index=0;
    for(int i=0;i<m.length;i++){
       int  count=0;
        for(int j=0;j<m[i].length;j++){
            if(m[i][j]==1){
                count++;
            }
            if(count>index){
                index=count;
                row = i;
            }
        }
    }
    return new int[]{row,index};
    
    }
}