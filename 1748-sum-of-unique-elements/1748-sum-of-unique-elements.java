class Solution {
    public int sumOfUnique(int[] n) {
        int arr[]=new int[101];
        int c=0;
        for(int i=0;i<n.length;i++){
           arr[n[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c+=i;
            }
        }
        return c;

    }
}