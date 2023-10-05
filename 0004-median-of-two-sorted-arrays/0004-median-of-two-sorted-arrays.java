class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double num = 0.0000;
        int[] arr = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        for(i=0;i<nums1.length;i++){
            arr[j] = nums1[i];
            j++;
        }
        for(i=0;i<nums2.length;i++){
            arr[j]=nums2[i];
            j++;
        }
        Arrays.sort(arr);
        if(j%2==0){
            num = (arr[j/2] + arr[(j/2)-1])/2.0;
        }
        else{
            num = arr[j/2];
        }

        return num;
    }
}