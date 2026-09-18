class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n]; // To store next smallest element

        // Store index instead of its element
        nse[n-1] = n; 
        st.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        while(!st.isEmpty()) st.pop(); // now stack is empty
        int[] pse = new int[n]; // To store previous smallest element

        pse[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        int max = 0;
        for(int i = 0; i < n; i++){
           int area = heights[i] * (nse[i]-pse[i]-1);
           max = Math.max(max,area);
        }
        return max;
    }
}