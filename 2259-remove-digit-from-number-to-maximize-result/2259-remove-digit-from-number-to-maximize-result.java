class Solution {
    public String removeDigit(String number, char digit) {
       List <String> output= new ArrayList<>();
       for(int i=0;i<number.length();i++){
         if(number.charAt(i)==digit){
         String str1= number.substring(0,i);
         String str2= number.substring(i+1);
         output.add(str1+str2);
         }
       }
       String m=Collections.max(output);
       return m;
    }
}