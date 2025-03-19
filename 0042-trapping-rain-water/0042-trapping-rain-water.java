class Solution {
    public int trap(int[] arr) {
        int total=0, rightMax=0 ,leftMax = 0 ;
        int left =0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] <= arr[right]){
                if(leftMax > arr[left])
                total += leftMax - arr[left];
                else
                leftMax = arr[left];

                left+=1;
            }
            else{
                 if(rightMax > arr[right])
                total += rightMax - arr[right];
                else
                rightMax = arr[right];
                right-=1;
            }
        }
       
        return total;

    }
}