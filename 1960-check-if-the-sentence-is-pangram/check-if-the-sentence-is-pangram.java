class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
            for(char ch : sentence.toCharArray()){
                arr[ch-'a'] = true;
            }
            for(boolean b : arr){
                if(!b) return false;
            }
        
        return true;
    }
}