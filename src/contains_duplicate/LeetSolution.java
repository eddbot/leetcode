package contains_duplicate;

import interfaces.Solution;

import java.util.HashSet;

public class LeetSolution implements Solution {

    private boolean containsDuplicate(int[] nums) {

        HashSet<Integer> distinct = new HashSet<>();

        for (int num: nums) {
            if(!distinct.add(num)) {
                return true;
            }
        }
        return false;

    }
    @Override
    public void Solve() {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
}
