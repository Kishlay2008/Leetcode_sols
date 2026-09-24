class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            if(num >= 0) st.push(num);
            else{
            while (!st.isEmpty() && st.peek() > 0 && Math.abs(num) > st.peek()){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(num)){
                st.pop();
                continue;
            }
            if(st.isEmpty() || st.peek() < 0) st.push(num);
        }
        }
        int[] arr = new int[st.size()];
        for(int i = arr.length-1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}