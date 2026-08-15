class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int prefloor = 0;

        int ans=0;


        for(int i : requests){
            
            int currentfloor = i;

            ans = ans + Math.abs(currentfloor - prefloor);
            prefloor=currentfloor;
        }
        return ans;
    }
}