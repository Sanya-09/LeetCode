class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        // 1 ^ 1 = 0 
        // 0 ^ 1 = 1
        for(int i = 0 ; i < nums.length ; i++){
            n = n ^ nums[i];
        }
        return n ;
    }
}