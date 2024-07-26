import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] mta = s.toCharArray();
        char[] sta = t.toCharArray();
        
        Arrays.sort(mta);
        Arrays.sort(sta);
        
        return Arrays.equals(mta, sta);
    }
}