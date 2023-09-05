class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        
        for(int i=1;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j=1;j<i;j++){
                int sum = prev.get(j-1)+prev.get(j);
                curr.add(sum);
            }
            curr.add(1);
            prev = curr;
        }
        return prev;
    }
}