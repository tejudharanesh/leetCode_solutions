class Solution {
    public int triangularSum(int[] nums) {
     int n = nums.length;
     int sum =0;
     if(n==1){
         return nums[0];
     }
     if(n==2){
         sum = nums[0]+nums[1];
         return sum%10;
     }
     while(n>=2){
     for(int i=0;i<=n-2;i++){
         nums[i] = (nums[i]+nums[i+1])%10;
     }
     n--;
     }

     return nums[0];
    }
}