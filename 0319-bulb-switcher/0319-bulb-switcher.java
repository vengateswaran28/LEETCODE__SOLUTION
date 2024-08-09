class Solution {
    public int bulbSwitch(int n) {
      int increment=0;
      for(int i=1;i*i<=n;i++){
        increment++;
      }  
      return increment;
    }
}