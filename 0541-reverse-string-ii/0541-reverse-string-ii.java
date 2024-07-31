class Solution {
    public String reverseStr(String s, int k) {
     char chars[]=new char[s.length()];
     for(int i=0;i<s.length();i++){
        chars[i]=s.charAt(i);
     }
      for (int i = 0; i < s.length() - 1; i += 2 * k) {
            int st=i;
            int j= Math.min(i + k - 1, s.length() - 1);
            
            while (st < j) {
                char temp = chars[st];
                chars[st++] = chars[j];
                chars[j--] = temp;
            }
        }
        
        return new String(chars);
        }
    
}