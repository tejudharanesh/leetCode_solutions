class Solution {
    public List<List<Integer>> generate(int row) {
        
        List<List<Integer>> pascal = new ArrayList<>();

        if(row <= 0){
            return pascal;
        }

        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);

        for(int i=1;i<row;i++){
            List<Integer> current = new ArrayList<>();
            List<Integer> pre = pascal.get(i-1);

            current.add(1);
            for(int j=1;j<i;j++){
                int sum = pre.get(j-1)+pre.get(j);
                current.add(sum);
            }
            current.add(1);

            pascal.add(current);


        }
        return pascal;

    }
}