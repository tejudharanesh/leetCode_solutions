class Solution {
    public int trap(int[] h) {
        int i=0;
        int j=h.length-1;
        int leftMax =0;
        int rightMax=0;
        int count=0;

        while(i<j){
            if(h[i]<=h[j]){
                leftMax = Math.max(h[i],leftMax);
                count+= leftMax-h[i];
                i++;
                
            }
            else{
                rightMax = Math.max(h[j],rightMax);
                count+= rightMax-h[j];
                j--;

            }
        }
        return count;
    }
}