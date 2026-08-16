class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int prefloor = 0;

        int ans=0;
        for(int i=0 ; i<requests.length ; i++){
            
            int currentfloor = requests[i];
            ans = ans + Math.abs(currentfloor - prefloor);
            prefloor=currentfloor;
        }
        return ans;
    }
}