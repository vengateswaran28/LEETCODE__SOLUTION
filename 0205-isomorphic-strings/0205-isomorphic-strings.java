class Solution {
    public boolean isIsomorphic(String s, String t) {
         int arr1[]=new int [s.length()];  
         int arr2[]=new int [t.length()];
         for(int i=0;i<arr1.length;i++){
            arr1[i]=s.charAt(i);
         }  
         for(int j=0;j<arr2.length;j++){
            arr2[j]=t.charAt(j);
         }  
         int c=1;
        
         for(int j=1;j<s.length();j++){
            if(arr1[j]==arr1[j-1]){
                c++;
            
         
         System.out.print(c);
            }
         }
          int k=1;
         for(int i=1;i<t.length();i++){
            if(arr2[i]==arr2[i-1]){
                k++;
            }
            // System.out.print(k);
         }
         if(k==0 && c==0)
         return false;
        if(c!=k){ 
         return false;
  }
  return true;
}
}