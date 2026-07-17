class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int mid;

        for(int i = 0 ; i < piles.length; i++){
            end = Math.max(end , piles[i]);
        }
        // for (int i : piles) {
        //     end = Math.max(end,i);
        // }

        int ans = end;

        while (start <= end) {

            mid = (start + (end - start) / 2);

            long total_time = 0;

            for(int i = 0; i< piles.length;i++){
                total_time += piles[i]/mid;
                if(piles[i]%mid != 0){
                    total_time++;
                }
            }
            // for (int i : piles) {
            //     total_time += i/ mid;
            //     if (i % mid != 0) {
            //         total_time++;
            //     }
            // }

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