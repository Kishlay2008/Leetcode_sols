class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int num : arr1) {
            boolean valid = true;
            int left = num - d;
            int right = num + d;
            for (int num2 : arr2) {
                if (num2 >= left && num2 <= right) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans++;
            }
        }
        return ans;
    }
}