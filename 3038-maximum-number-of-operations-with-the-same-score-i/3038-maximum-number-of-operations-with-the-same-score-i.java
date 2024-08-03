class Solution {
    public int maxOperations(int[] nums) {
     int sum=0;
     int c=0;
    int i=0;
           while(i<nums.length-1){
            sum=nums[i]+nums[i+1];
            if(sum==5){
                c++;
                i+=2;
            
            }
            else
            break;
        }
        return c;
     }
    }
