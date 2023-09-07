class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[j]+nums[k]==-nums[i]){
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    threeSum.add(curr);

                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }

                    j++;
                    k--;

                }
                else if(nums[j]+nums[k]< -nums[i]){
                    j++;
                }
                else{
                    k--;
                }
                
            }

           
        }
        return threeSum;
    }
}