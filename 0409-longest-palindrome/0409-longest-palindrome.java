class Solution {
    public int longestPalindrome(String s) {
       Map<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char c=s.chartAt(i);
        if(map.containKey(c))
        {
                map.put(c,map.get(c)+1)
        }
        else{
            map.put(c,1);
        }
       }




       for (Map.Entry<Character,Integer> entry : map.entrySet())  
            
                     int i=entry.getValue()); 
    
       int ans=0;
       int count =0; 
      

       for (Map.Entry<String,String> entry : map.entrySet()) {
            
                     int i=entry.getValue()); 
        if(i%2==0)
        {
           ans+=i;
           
        }
        else{
            if(count==0){
                ans=ans+i;
                count++;
            }
            else{
                 ans=ans+i-1;
            }
        }
          return ans;
       }
    }
}