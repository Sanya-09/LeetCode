class Solution {
    public int removeDuplicates(int[] nums) {
        // optimal approach 
        int i = 0 ; 
        for(int j = 1 ; j<= nums.length-1 ; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1 ;
    }
}