package kth_largest_element_in_a_stream;

import interfaces.Solution;

import java.util.*;


class LeetSolution implements Solution {
    private final int k;
    private final ArrayList<Integer> nums = new ArrayList<>() {
    };

    public LeetSolution(int k, int[] nums) {
        this.k = k;
        Arrays.stream(nums).forEach(i -> this.nums.add(i));
    }

    public int add(int val){
        nums.add(val);
        nums.sort(Comparator.reverseOrder());
        return nums.get(k-1);
    }

    @Override
    public void Solve() {

    }
}