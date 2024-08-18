class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            count1++;
        }
        int count0=s.length()-count1;
        StringBuilder build =new StringBuilder();
        while(count1>1)
        {
            build.append("1");
            count1--;
        }
        while(count0>0){
            build.append("0");
            count0--;
        }
        build.append("1");
        return build.toString();
    }
}