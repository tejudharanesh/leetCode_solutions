class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int i=0;
        int j=0;
        int k=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==diff){
                    for(k=j;k<nums.length;k++){
                        if(nums[k]-nums[j]==diff){
                            count++;
                            continue;
                        }
                    }
                }
            }
        }
        return count;
    }
}