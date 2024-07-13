class Solution {
    public int mySqrt(int x) {
     int low = 1, high = x;
        if((x==0)||(x==1)){
            return x;
        }

        while (low<=high) {
            int mid = (low+high)/2;  
            if(x/mid==mid){ //if mid*mid=x(3*3=9), then mid will be the sqrt(x)
                return mid;
            }
            else if(x/mid<mid){ //if (mid*mid)<x, then the sqrt(x) is lower than mid
                high=mid-1;
            }
            else if(x/mid>mid){ //if (mid*mid)<x, then the sqrt(x) is higher than mid
                low=mid+1;
            }
            
        }
        return high; //if none of those work than high will be the ans
    }
}