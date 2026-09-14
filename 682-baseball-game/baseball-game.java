class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        if(operations[0] == "C") return 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                if(!st.isEmpty())
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("+")){
                int p = st.pop();
                int s = st.peek();
                s += p;
                st.push(p);
                st.push(s);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}