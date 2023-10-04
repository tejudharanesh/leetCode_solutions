class Solution {
    public int strStr(String a, String b) {
        int m = a.length();
        int n = b.length();
        if(m==0 || n==0){
            return -1;
        }
        if(a.equals(b)){
            return 0;
        }
        for(int i=0;i < m-n+1;i++){
            if(a.substring(i,i+n).equals(b)){
                return i;
            }
           
        }
        return -1;
    }
}