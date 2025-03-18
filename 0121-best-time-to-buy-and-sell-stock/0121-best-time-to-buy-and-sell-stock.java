class Solution {
    public int maxProfit(int[] prices) {
        int m =Integer.MAX_VALUE;
        int ans =0;
        int n=0;

        for(int i=0;i<prices.length;i++){
            if( prices[i] < m){
                 m=prices[i];
            }
            n=prices[i] - m;
            if(ans < n){
                ans=n;
            }
        }
        return ans;
    }
}