class Solution {
    public int countTestedDevices(int[] b) {
        int count=0;
         for(int i=0;i<b.length;i++){
            if(b[i]>0)
            {
                count=count+1;
                for(int j=i+1;j<b.length;j++){
                    if(b[j]>0){
                    int temp=b[j]-1;
                    b[j]=temp;
                    }
                }
            }
         }
            return count;
         
    }
}