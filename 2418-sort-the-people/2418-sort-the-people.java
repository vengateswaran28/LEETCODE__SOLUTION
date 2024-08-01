class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        Map<Integer, String> m = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            m.put(h[i], n[i]);
        }        
        Arrays.sort(h);
        String[] r = new String[h.length];
        int in = 0;
        for (int i = h.length - 1; i >= 0; i--) {
            r[in] = m.get(h[i]);
            in++;
        }
        return r;
    }
}