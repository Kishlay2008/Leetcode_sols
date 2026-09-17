class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums.length];
        int k = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            st.push(nums[i]);
        }
        for(int i = nums.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[k--] = -1;
            }
            else{
                ans[k--] = st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}