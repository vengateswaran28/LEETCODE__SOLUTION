class Solution {
    public String finalString(String s) {
        //String result="";
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
            str.reverse();
            }
            else{
                str.append(s.charAt(i));
            }
            
        }
        return str.toString();
    }
}