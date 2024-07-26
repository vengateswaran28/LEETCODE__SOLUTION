class Solution {
    public int balancedStringSplit(String s) {
        char c[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        int count=0;
        int a =0;
        for(int i=0;i<s.length();i++){
            if(c[i]=='R'){
                a++;
            }
            else{
                a--;
            }
        
        //int ans=count;
        if(a==0){
        count++;
        }
        }
        return count;
    }
}