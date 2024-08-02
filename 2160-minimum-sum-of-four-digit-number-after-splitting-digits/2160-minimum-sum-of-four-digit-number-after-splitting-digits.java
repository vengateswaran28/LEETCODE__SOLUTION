class Solution {
    public int minimumSum(int n) {
        int a[]= new int[4];
        int index=0;
        while(n>0){
            a[index++]=n%10;
            n/=10;
        }
        Arrays.sort(a);
        System.out.print();
        int n1=(a[0]*10)   +  a[2];
        int n2=(a[1]*10) +a[3];
        return n1+n2;
    }
}