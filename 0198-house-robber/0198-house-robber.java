class Solution {

    public int rob(int[] nums) {
        int prev = nums[0];
        int prev2 = 0;

        for(int i=0;i<nums.length;i++){
            int take = nums[i];
            if(i>1) take+= prev2;

            int notTake = 0 + prev;

            int current = Math.max(take,notTake);

            prev2 = prev;
            prev=current;
        }

        return prev;
    }
}