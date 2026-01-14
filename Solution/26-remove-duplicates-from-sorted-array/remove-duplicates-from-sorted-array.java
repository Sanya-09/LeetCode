class Solution {
    public int removeDuplicates(int[] nums) {
        // set has no duplicates
        HashSet<Integer> st = new HashSet<>();
        int unique = 0;
        for(int num: nums){
            if(!st.contains(num)){
                st.add(num);
                nums[unique] = num;
                unique ++;
            }
        }
        return unique;
    }
}