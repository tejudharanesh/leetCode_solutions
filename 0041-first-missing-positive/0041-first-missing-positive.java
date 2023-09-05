class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       int[] temp = new int[n+1];
       for(int i=0;i<n;i++){
           if(nums[i]>0 && nums[i]<=n){
               temp[nums[i]]=1;
           }
       }
       for(int i=1;i<temp.length;i++){
           if(temp[i]==0){
               return i;
           }
       }
 return n+1;
    }
}