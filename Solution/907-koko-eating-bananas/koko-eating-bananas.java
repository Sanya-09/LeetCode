class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int mid;

        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while (start <= end) {

            mid = (start + (end - start) / 2);

            long total_time = 0;

            for (int pile : piles) {
                total_time += pile / mid;
                if (pile % mid != 0) {
                    total_time++;
                }
            }

            if (total_time > h) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}