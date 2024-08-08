class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
         StringBuilder c = new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c.append(s.charAt(i));
            }
         }
        String orginal=c.toString();
        String alter =c.reverse().toString();
        return orginal.equals(alter);
    }
}