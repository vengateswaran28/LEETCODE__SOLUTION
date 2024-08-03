class Solution {
    public int maxOperations(int[] nums) {
     int sum=0;
     int c=0;
    int i=0;
    int  sum1=nums[0]+nums[1];
           while(i<nums.length-1){
        
            sum=nums[i]+nums[i+1];
            if(sum==sum1){
                c++;
                i=i+2;
            
            }
            else
            break;
        }
        return c;
     }
    }
