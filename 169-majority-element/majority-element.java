class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                int freq = map.get(val);
                map.put(val,freq+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(int val : nums){
            if(map.get(val) > nums.length/2) return val;
        }
        return -1;
    }
}