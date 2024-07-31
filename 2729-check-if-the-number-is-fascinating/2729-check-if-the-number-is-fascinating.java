class Solution {
    public boolean isFascinating(int n) {
        int m=n*2;
        int o=n*3;
        
        String str=n+""+m+""+o;
        if(str.length()<8){
        return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
            return false;
        }
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
          return false;
    }
        }
    }
    return true;
    }
}