class Solution {
    public int[][] modifiedMatrix(int[][] m) {
        int x[]=new int [m[0].length];
        for(int i=0;i<m[0].length;i++){
            for(int j=0;j<m.length;j++){
                 x[i]=Math.max(x[i],m[j][i]);
                 }
            }
        
        for(int k=0;k<m.length;k++){
            for(int l=0;l<m[0].length;l++){
                  if(m[k][l]==-1){ 
                      m[k][l]=x[l];
                    }
                  }
            }
            return m;
        }
}
    
