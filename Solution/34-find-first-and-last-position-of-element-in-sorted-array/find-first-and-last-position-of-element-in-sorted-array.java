class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int first = -1;
        int mid;

        int[] output = {-1, -1};
        // first 
        while(start<=end){
            mid = (start+(end-start)/2);
            if(nums[mid]==target){
                first = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        output[0] = first;

        // last 
        start = 0;
        end = nums.length - 1;
        int last = -1;

        while(start<=end){
            mid = (start+(end-start)/2);
            if(nums[mid]==target){
                last = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        output[1] = last;
        return output;
    }
}