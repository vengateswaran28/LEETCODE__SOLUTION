class Solution {
    public String losingPlayer(int x, int y) {
      //  return( (x,y/4)%2)?"Alice":"Bob";
      int cnt = 1;
        while (x > 0 && y > 3) {
            x -= 1;
            y -= 4;
            cnt++;
        }
        return (cnt % 2 == 0) ? "Alice" : "Bob";
    }
}