
class Solution {
    public String reverseVowels(String s) {
        String st =s.toLowerCase();
         char[] arr=st.toCharArray();
        int i=0,j=arr.length-1;
         while(i<j){
            if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u'){
                if(arr[j]=='a' ||arr[j]=='e' ||arr[j]=='i' ||arr[j]=='o' ||arr[j]=='u'){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
         }
        return String.valueOf(arr);
    }
}
