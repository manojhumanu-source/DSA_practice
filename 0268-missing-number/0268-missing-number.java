class Solution {
    public int missingNumber(int[] nums) {
        int n1 = nums.length;
        int n = 0;

        for (int i = 0; i <= n1; i++) {
            n = n ^ i;
        }

        for (int i = 0; i < nums.length; i++) {
            n = n ^ nums[i];
        }

        return n;
    }
}