package two_sum;

import interfaces.Solution;

import java.util.Arrays;
import java.util.HashMap;

public class LeetSolution implements Solution {
    @Override
    public void Solve() {
         System.out.println(Arrays.toString(twoSumWithArray(new int[]{2, 7, 11, 15}, 9)));
         System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }


    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsHash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer n = numsHash.get(target - nums[i]);

            if (n != null && n != i) {
                return new int[]{i, n};
            }
            numsHash.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSumWithArray(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
