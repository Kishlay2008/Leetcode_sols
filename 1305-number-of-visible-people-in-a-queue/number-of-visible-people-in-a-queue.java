class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[heights.length];
        arr[arr.length-1] = 0;
        st.push(heights[heights.length-1]);
        for(int i = arr.length-2; i >= 0; i--){
            int count = 0;
            while(!st.isEmpty() && heights[i] >= st.peek()){
                count++;
                st.pop();
            }
            if(!st.isEmpty()){
            count++;
            }
            arr[i] = count;
            st.push(heights[i]);
        }
        return arr;
    }
}