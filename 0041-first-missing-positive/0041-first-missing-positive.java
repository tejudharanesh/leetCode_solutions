class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       int isOne = 0;
       for(int i=0;i<n;i++){
           if(nums[i]==1){
               isOne = 1;
               break;
           }
       }
       if(isOne==0){
           return 1;
       }

       for(int i=0;i<n;i++){
           if(nums[i]<=0 || nums[i]>n){
               nums[i]=1;
           }
       }
       for(int i=0;i<n;i++){
           nums[(nums[i]-1) %n]+=n;
       }

       for(int i=0;i<n;i++){
           if(nums[i]<=n){
               return (i+1);
           }
       }
       return(n+1);
    }
}