class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
      int last=0;
      for(int i=1;i<=mainTank;i++){
       if(i%5==0 && additionalTank!=0){
            additionalTank-=1;
            mainTank+=1;
            last+=10;
        }
        else{
            last+=10;
        }
      }  
      return last;
    }
}