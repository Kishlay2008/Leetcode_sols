class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        long sum = 0;
        int score = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > 0){
                score++;
            }
            else{
                break;
            }
        }
        return score;
    }
}