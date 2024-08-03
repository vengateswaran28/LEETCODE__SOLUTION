class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<target.length;i++){
            if(arr[i]==target[i]){
                count++;
            }
        }
        if(count ==arr.length){
            return true;
        }
        return false;
    }
}