class Solution {
    public int tribonacci(int n) {
      
        if(n<=1){
            return n;
        }
        int arr[]=new int[n+1];
        int f1=0,f2=1;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<=n;i++){
           arr[i]=arr[i-2]+arr[i-1]+arr[i-3];
        }
        return arr[n];
    
    }
}