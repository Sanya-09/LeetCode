class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int x = 0;
        int res = 0;
        for(int num : nums){
            pq.add(num);

            if(pq.size()>k){
                x=pq.poll();
            }
        }
        res = pq.peek();
        return res;
    }
}