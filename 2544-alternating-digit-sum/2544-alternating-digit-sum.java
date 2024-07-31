class Solution {
    public int alternateDigitSum(int n) {
        int odd=0;
        int even=0;
        String m=Integer.toString(n);
        int len=m.length();

        for(int i=0;i<len;i+=2){
            if(i%2==0)
            even+=m.charAt(i)-'0';
             System.out.print(even);
        }
               for(int i=1;i<len;i+=2){
            if(i%2==1)
            odd+=m.charAt(i)-'0';
             //System.out.print(odd);
        }
        
    return (int)(even-odd);
    }
}