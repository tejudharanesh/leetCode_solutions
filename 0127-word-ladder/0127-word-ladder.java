class Pair{
    String first;
    int second;
    Pair(String _first, int _second){
        this.first = _first;
        this.second = _second;
    }
}
class Solution {
    public int ladderLength(String startWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord, 1));
        Set<String> st = new HashSet<>(wordList);
        
        if (!st.contains(endWord)) {
            return 0;
        }
        
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            
            if (word.equals(endWord)) {
                return steps;
            }
            
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);
                    
                    if (st.contains(replacedWord)) {
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps + 1));
                    }
                }
            }
        }
        
        return 0;
    }
}