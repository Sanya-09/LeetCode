class Solution {
    public int minRotations(String s) {
        int res = 0;
        int curr = 0;
        for(int i = 0; i <= 9; i++){
            int present = Integer.parseInt(s.charAt(i) + "");
            int clock = Math.abs(present - curr);
            int anti = 10 - clock;
            int ans = Math.min(clock , anti);
            res += ans;
            curr = present;
        }
        return res;
    }
}