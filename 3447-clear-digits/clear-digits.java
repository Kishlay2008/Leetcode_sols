class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)) st.push(ch);
            else st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}