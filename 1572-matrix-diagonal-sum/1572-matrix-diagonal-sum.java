class Solution {
    public int diagonalSum(int[][] m) {
     int sum=0;
     int j=m.length-1;
        for(int i=0;i<m.length;i++){
            if(i!=j){
         sum+=m[i][j];

         // System.out.println(sum);
            }
            j--;
           // System.out.print(sum);
       sum+=m[i][i]; 
            
        }
        return sum;
    }
}