class Solution {
    public int maxDepth(String s) {
        int ct =00;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(') st.push(c);
            else if(c==')') {
                if(st.size() >ct) ct=st.size();
                st.pop();
            }
        }return ct;
    }
}