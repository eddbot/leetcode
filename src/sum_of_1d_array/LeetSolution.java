package sum_of_1d_array;

import interfaces.Solution;

public class LeetSolution implements Solution {
    public int[] runningSum(int[]nums) {
        if(nums.length == 0) {
            return nums;
        }
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    @Override
    public void Solve() {

    }
}
