class Solution {
    public List<List<Integer>> generate(int row) {
        
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();

        if(row <= 0){
            return pascal;
        }
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        pascal.add(pre);

        for(int i=1; i< row;i++){
            ArrayList<Integer> current = new ArrayList<Integer>();
        
            current.add(1);
            for(int j=1; j<i;j++){
                int sum = pre.get(j-1)+pre.get(j);
                current.add(sum);
            }
            current.add(1);

            pascal.add(current);
            pre = current;

        }
        return pascal;

    }
}