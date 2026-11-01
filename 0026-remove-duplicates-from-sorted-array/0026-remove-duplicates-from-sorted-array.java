import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s1 = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            s1.add(nums[i]);
        }

        int i = 0;

        for (int x : s1) {
            nums[i] = x;
            i++;
        }

        return i;
    }
}