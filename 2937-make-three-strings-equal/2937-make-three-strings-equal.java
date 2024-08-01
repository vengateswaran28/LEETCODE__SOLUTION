class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
    String str1="";
    String str2="";
        int len1=s1.length();
        int len2=s2.length();
       for(int i=0;i<len1-1;i++)
       str1+=s1.charAt(i);
       System.out.print(str1);
       for(int i=0;i<len2-1;i++) 
       str2+=s1.charAt(i);
       System.out.print(str2);
       if(str1.equals(str2)&& str1.equals(s3))
       return 2;
       else
       return -1;
    }
}