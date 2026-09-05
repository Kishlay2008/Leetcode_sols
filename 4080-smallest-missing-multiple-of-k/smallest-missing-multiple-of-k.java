class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int max = nums[0];
        for(int num : nums){
           if(num%k==0){
            max = Math.max(max,num);
            set.add(num);
           }
        }
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(k*(i+1))){
                return k*(i+1);
            }
        }
       return max+k;
    }
}