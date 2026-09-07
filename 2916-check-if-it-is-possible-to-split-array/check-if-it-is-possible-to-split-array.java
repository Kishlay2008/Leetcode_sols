class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        if(nums.size() <= 2) return true;
        int sum = 0;
        for(int i = nums.size()-2; i >= 0; i--){
            if(nums.get(i) + nums.get(i+1) >= m){
                return true;
            }
        }
        return false;
    }
}