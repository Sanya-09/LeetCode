class Solution {
    public int mySqrt(int n) {
        int start = 0;
        int end = n-1;
        int mid;
        int ans = 0;
        if (n == 0 || n == 1){
            return n;
        } else{
            while(start<=end){
            mid = (start+(end-start)/2);
            long sqr = (long) mid * mid;
            if(sqr == n){
                ans = mid;
                break;
            } else if(sqr < n){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            } 
        }
        }
        return ans;
    }
}