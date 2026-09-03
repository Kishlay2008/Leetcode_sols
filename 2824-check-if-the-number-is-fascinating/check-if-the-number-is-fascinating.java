class Solution {
    public boolean isFascinating(int n) {
        String s = ""+n+(n*2)+(n*3);
        if(s.length() != 9) return false;
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch == '0') return false;
            if(set.contains(ch)) return false;
            set.add(ch);
        }
         return true;
    }
}