
class Solution {
    public int calPoints(String[] o) {
        int a[]=new int[o.length];
        int ans=0,c=0;
        for(int i=0;i<o.length;i++){
            if(o[i].equals("+")) a[c++]=a[c-2]+a[c-3];
            else if(o[i].equals("D")) a[c++]=2*a[c-2];
            else if(o[i].equals("C")) c--;
            else a[c++]=Integer.parseInt(o[i]);
        }
        for(int i=0;i<c;i++)
        ans+=a[i];
        return ans;
    }
}