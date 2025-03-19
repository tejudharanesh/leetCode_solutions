class Solution {
    public int f(int index, int[] nums, int[] memo){
        if(index == 0) return nums[index];
        if(index < 0 ) return 0;

        if(memo[index] != -1) return memo[index];

        int pick = nums[index] + f(index-2, nums,memo);
        int notPick = 0 + f(index-1, nums,memo);

        return memo[index] = Math.max(pick,notPick);
    }

    public int rob(int[] nums) {
        int[] memo = new int[nums.length+1];
        Arrays.fill(memo, -1);

       return f(nums.length -1, nums, memo);
    }
}